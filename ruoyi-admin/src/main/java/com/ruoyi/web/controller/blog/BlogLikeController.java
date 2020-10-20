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
import com.ruoyi.system.domain.blog.BlogLike;
import com.ruoyi.system.service.blog.IBlogLikeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 点赞Controller
 * 
 * @author admin
 * @date 2020-10-20
 */
@Controller
@RequestMapping("/blog/like")
public class BlogLikeController extends BaseController
{
    private String prefix = "blog/like";

    @Autowired
    private IBlogLikeService blogLikeService;

    @RequiresPermissions("blog:like:view")
    @GetMapping()
    public String like()
    {
        return prefix + "/like";
    }

    /**
     * 查询点赞列表
     */
    @RequiresPermissions("blog:like:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BlogLike blogLike)
    {
        startPage();
        List<BlogLike> list = blogLikeService.selectBlogLikeList(blogLike);
        return getDataTable(list);
    }

    /**
     * 导出点赞列表
     */
    @RequiresPermissions("blog:like:export")
    @Log(title = "点赞", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BlogLike blogLike)
    {
        List<BlogLike> list = blogLikeService.selectBlogLikeList(blogLike);
        ExcelUtil<BlogLike> util = new ExcelUtil<BlogLike>(BlogLike.class);
        return util.exportExcel(list, "like");
    }

    /**
     * 新增点赞
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存点赞
     */
    @RequiresPermissions("blog:like:add")
    @Log(title = "点赞", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BlogLike blogLike)
    {
        return toAjax(blogLikeService.insertBlogLike(blogLike));
    }

    /**
     * 修改点赞
     */
    @GetMapping("/edit/{likeId}")
    public String edit(@PathVariable("likeId") Long likeId, ModelMap mmap)
    {
        BlogLike blogLike = blogLikeService.selectBlogLikeById(likeId);
        mmap.put("blogLike", blogLike);
        return prefix + "/edit";
    }

    /**
     * 修改保存点赞
     */
    @RequiresPermissions("blog:like:edit")
    @Log(title = "点赞", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BlogLike blogLike)
    {
        return toAjax(blogLikeService.updateBlogLike(blogLike));
    }

    /**
     * 删除点赞
     */
    @RequiresPermissions("blog:like:remove")
    @Log(title = "点赞", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(blogLikeService.deleteBlogLikeByIds(ids));
    }
}
