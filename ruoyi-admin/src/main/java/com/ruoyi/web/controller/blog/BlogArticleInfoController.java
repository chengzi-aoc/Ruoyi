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
import com.ruoyi.system.domain.blog.BlogArticleInfo;
import com.ruoyi.system.service.blog.IBlogArticleInfoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 文章内容信息Controller
 * 
 * @author admin
 * @date 2020-10-20
 */
@Controller
@RequestMapping("/blog/info")
public class BlogArticleInfoController extends BaseController
{
    private String prefix = "blog/info";

    @Autowired
    private IBlogArticleInfoService blogArticleInfoService;

    @RequiresPermissions("blog:info:view")
    @GetMapping()
    public String info()
    {
        return prefix + "/info";
    }

    /**
     * 查询文章内容信息列表
     */
    @RequiresPermissions("blog:info:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BlogArticleInfo blogArticleInfo)
    {
        startPage();
        List<BlogArticleInfo> list = blogArticleInfoService.selectBlogArticleInfoList(blogArticleInfo);
        return getDataTable(list);
    }

    /**
     * 导出文章内容信息列表
     */
    @RequiresPermissions("blog:info:export")
    @Log(title = "文章内容信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BlogArticleInfo blogArticleInfo)
    {
        List<BlogArticleInfo> list = blogArticleInfoService.selectBlogArticleInfoList(blogArticleInfo);
        ExcelUtil<BlogArticleInfo> util = new ExcelUtil<BlogArticleInfo>(BlogArticleInfo.class);
        return util.exportExcel(list, "info");
    }

    /**
     * 新增文章内容信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存文章内容信息
     */
    @RequiresPermissions("blog:info:add")
    @Log(title = "文章内容信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BlogArticleInfo blogArticleInfo)
    {
        return toAjax(blogArticleInfoService.insertBlogArticleInfo(blogArticleInfo));
    }

    /**
     * 修改文章内容信息
     */
    @GetMapping("/edit/{articleId}")
    public String edit(@PathVariable("articleId") Long articleId, ModelMap mmap)
    {
        BlogArticleInfo blogArticleInfo = blogArticleInfoService.selectBlogArticleInfoById(articleId);
        mmap.put("blogArticleInfo", blogArticleInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存文章内容信息
     */
    @RequiresPermissions("blog:info:edit")
    @Log(title = "文章内容信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BlogArticleInfo blogArticleInfo)
    {
        return toAjax(blogArticleInfoService.updateBlogArticleInfo(blogArticleInfo));
    }

    /**
     * 删除文章内容信息
     */
    @RequiresPermissions("blog:info:remove")
    @Log(title = "文章内容信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(blogArticleInfoService.deleteBlogArticleInfoByIds(ids));
    }
}
