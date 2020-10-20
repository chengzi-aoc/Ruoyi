package com.ruoyi.web.controller.blog;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.blog.BlogAttention;
import com.ruoyi.system.service.blog.IBlogAttentionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 关注信息Controller
 * 
 * @author admin
 * @date 2020-10-20
 */
@Controller
@RequestMapping("/blog/attention")
public class BlogAttentionController extends BaseController
{
    private String prefix = "blog/attention";

    @Autowired
    private IBlogAttentionService blogAttentionService;

    @RequiresPermissions("blog:attention:view")
    @GetMapping()
    public String attention()
    {
        return prefix + "/attention";
    }

    /**
     * 查询关注信息列表
     */
    @RequiresPermissions("blog:attention:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BlogAttention blogAttention)
    {
        startPage();
        List<BlogAttention> list = blogAttentionService.selectBlogAttentionList(blogAttention);
        return getDataTable(list);
    }

    /**
     * 导出关注信息列表
     */
    @RequiresPermissions("blog:attention:export")
    @Log(title = "关注信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BlogAttention blogAttention)
    {
        List<BlogAttention> list = blogAttentionService.selectBlogAttentionList(blogAttention);
        ExcelUtil<BlogAttention> util = new ExcelUtil<BlogAttention>(BlogAttention.class);
        return util.exportExcel(list, "attention");
    }

    /**
     * 新增关注信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存关注信息
     */
    @RequiresPermissions("blog:attention:add")
    @Log(title = "关注信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BlogAttention blogAttention)
    {
        return toAjax(blogAttentionService.insertBlogAttention(blogAttention));
    }

    /**
     * 修改关注信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BlogAttention blogAttention = blogAttentionService.selectBlogAttentionById(id);
        mmap.put("blogAttention", blogAttention);
        return prefix + "/edit";
    }

    /**
     * 修改保存关注信息
     */
    @RequiresPermissions("blog:attention:edit")
    @Log(title = "关注信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BlogAttention blogAttention)
    {
        return toAjax(blogAttentionService.updateBlogAttention(blogAttention));
    }

    /**
     * 删除关注信息
     */
    @RequiresPermissions("blog:attention:remove")
    @Log(title = "关注信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(blogAttentionService.deleteBlogAttentionByIds(ids));
    }
}
