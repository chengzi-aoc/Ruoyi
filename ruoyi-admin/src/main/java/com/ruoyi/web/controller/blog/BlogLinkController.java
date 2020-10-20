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
import com.ruoyi.system.domain.blog.BlogLink;
import com.ruoyi.system.service.blog.IBlogLinkService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 友情链接Controller
 * 
 * @author admin
 * @date 2020-10-20
 */
@Controller
@RequestMapping("/blog/link")
public class BlogLinkController extends BaseController
{
    private String prefix = "blog/link";

    @Autowired
    private IBlogLinkService blogLinkService;

    @RequiresPermissions("blog:link:view")
    @GetMapping()
    public String link()
    {
        return prefix + "/link";
    }

    /**
     * 查询友情链接列表
     */
    @RequiresPermissions("blog:link:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BlogLink blogLink)
    {
        startPage();
        List<BlogLink> list = blogLinkService.selectBlogLinkList(blogLink);
        return getDataTable(list);
    }

    /**
     * 导出友情链接列表
     */
    @RequiresPermissions("blog:link:export")
    @Log(title = "友情链接", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BlogLink blogLink)
    {
        List<BlogLink> list = blogLinkService.selectBlogLinkList(blogLink);
        ExcelUtil<BlogLink> util = new ExcelUtil<BlogLink>(BlogLink.class);
        return util.exportExcel(list, "link");
    }

    /**
     * 新增友情链接
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存友情链接
     */
    @RequiresPermissions("blog:link:add")
    @Log(title = "友情链接", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BlogLink blogLink)
    {
        return toAjax(blogLinkService.insertBlogLink(blogLink));
    }

    /**
     * 修改友情链接
     */
    @GetMapping("/edit/{linkId}")
    public String edit(@PathVariable("linkId") Long linkId, ModelMap mmap)
    {
        BlogLink blogLink = blogLinkService.selectBlogLinkById(linkId);
        mmap.put("blogLink", blogLink);
        return prefix + "/edit";
    }

    /**
     * 修改保存友情链接
     */
    @RequiresPermissions("blog:link:edit")
    @Log(title = "友情链接", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BlogLink blogLink)
    {
        return toAjax(blogLinkService.updateBlogLink(blogLink));
    }

    /**
     * 删除友情链接
     */
    @RequiresPermissions("blog:link:remove")
    @Log(title = "友情链接", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(blogLinkService.deleteBlogLinkByIds(ids));
    }
}
