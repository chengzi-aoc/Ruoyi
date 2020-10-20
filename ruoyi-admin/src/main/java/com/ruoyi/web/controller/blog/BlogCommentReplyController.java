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
import com.ruoyi.system.domain.blog.BlogCommentReply;
import com.ruoyi.system.service.blog.IBlogCommentReplyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 评论回复Controller
 * 
 * @author admin
 * @date 2020-10-20
 */
@Controller
@RequestMapping("/blog/reply")
public class BlogCommentReplyController extends BaseController
{
    private String prefix = "blog/reply";

    @Autowired
    private IBlogCommentReplyService blogCommentReplyService;

    @RequiresPermissions("blog:reply:view")
    @GetMapping()
    public String reply()
    {
        return prefix + "/reply";
    }

    /**
     * 查询评论回复列表
     */
    @RequiresPermissions("blog:reply:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BlogCommentReply blogCommentReply)
    {
        startPage();
        List<BlogCommentReply> list = blogCommentReplyService.selectBlogCommentReplyList(blogCommentReply);
        return getDataTable(list);
    }

    /**
     * 导出评论回复列表
     */
    @RequiresPermissions("blog:reply:export")
    @Log(title = "评论回复", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BlogCommentReply blogCommentReply)
    {
        List<BlogCommentReply> list = blogCommentReplyService.selectBlogCommentReplyList(blogCommentReply);
        ExcelUtil<BlogCommentReply> util = new ExcelUtil<BlogCommentReply>(BlogCommentReply.class);
        return util.exportExcel(list, "reply");
    }

    /**
     * 新增评论回复
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存评论回复
     */
    @RequiresPermissions("blog:reply:add")
    @Log(title = "评论回复", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BlogCommentReply blogCommentReply)
    {
        return toAjax(blogCommentReplyService.insertBlogCommentReply(blogCommentReply));
    }

    /**
     * 修改评论回复
     */
    @GetMapping("/edit/{replyId}")
    public String edit(@PathVariable("replyId") Long replyId, ModelMap mmap)
    {
        BlogCommentReply blogCommentReply = blogCommentReplyService.selectBlogCommentReplyById(replyId);
        mmap.put("blogCommentReply", blogCommentReply);
        return prefix + "/edit";
    }

    /**
     * 修改保存评论回复
     */
    @RequiresPermissions("blog:reply:edit")
    @Log(title = "评论回复", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BlogCommentReply blogCommentReply)
    {
        return toAjax(blogCommentReplyService.updateBlogCommentReply(blogCommentReply));
    }

    /**
     * 删除评论回复
     */
    @RequiresPermissions("blog:reply:remove")
    @Log(title = "评论回复", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(blogCommentReplyService.deleteBlogCommentReplyByIds(ids));
    }
}
