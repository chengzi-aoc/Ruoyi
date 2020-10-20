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
import com.ruoyi.system.domain.blog.BlogCollect;
import com.ruoyi.system.service.blog.IBlogCollectService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 收藏Controller
 * 
 * @author admin
 * @date 2020-10-20
 */
@Controller
@RequestMapping("/blog/collect")
public class BlogCollectController extends BaseController
{
    private String prefix = "blog/collect";

    @Autowired
    private IBlogCollectService blogCollectService;

    @RequiresPermissions("blog:collect:view")
    @GetMapping()
    public String collect()
    {
        return prefix + "/collect";
    }

    /**
     * 查询收藏列表
     */
    @RequiresPermissions("blog:collect:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BlogCollect blogCollect)
    {
        startPage();
        List<BlogCollect> list = blogCollectService.selectBlogCollectList(blogCollect);
        return getDataTable(list);
    }

    /**
     * 导出收藏列表
     */
    @RequiresPermissions("blog:collect:export")
    @Log(title = "收藏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BlogCollect blogCollect)
    {
        List<BlogCollect> list = blogCollectService.selectBlogCollectList(blogCollect);
        ExcelUtil<BlogCollect> util = new ExcelUtil<BlogCollect>(BlogCollect.class);
        return util.exportExcel(list, "collect");
    }

    /**
     * 新增收藏
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存收藏
     */
    @RequiresPermissions("blog:collect:add")
    @Log(title = "收藏", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BlogCollect blogCollect)
    {
        return toAjax(blogCollectService.insertBlogCollect(blogCollect));
    }

    /**
     * 修改收藏
     */
    @GetMapping("/edit/{collectId}")
    public String edit(@PathVariable("collectId") Long collectId, ModelMap mmap)
    {
        BlogCollect blogCollect = blogCollectService.selectBlogCollectById(collectId);
        mmap.put("blogCollect", blogCollect);
        return prefix + "/edit";
    }

    /**
     * 修改保存收藏
     */
    @RequiresPermissions("blog:collect:edit")
    @Log(title = "收藏", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BlogCollect blogCollect)
    {
        return toAjax(blogCollectService.updateBlogCollect(blogCollect));
    }

    /**
     * 删除收藏
     */
    @RequiresPermissions("blog:collect:remove")
    @Log(title = "收藏", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(blogCollectService.deleteBlogCollectByIds(ids));
    }
}
