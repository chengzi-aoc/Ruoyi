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
import com.ruoyi.system.domain.blog.BlogFeedback;
import com.ruoyi.system.service.blog.IBlogFeedbackService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 反馈建议Controller
 * 
 * @author admin
 * @date 2020-10-20
 */
@Controller
@RequestMapping("/blog/feedback")
public class BlogFeedbackController extends BaseController
{
    private String prefix = "blog/feedback";

    @Autowired
    private IBlogFeedbackService blogFeedbackService;

    @RequiresPermissions("blog:feedback:view")
    @GetMapping()
    public String feedback()
    {
        return prefix + "/feedback";
    }

    /**
     * 查询反馈建议列表
     */
    @RequiresPermissions("blog:feedback:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BlogFeedback blogFeedback)
    {
        startPage();
        List<BlogFeedback> list = blogFeedbackService.selectBlogFeedbackList(blogFeedback);
        return getDataTable(list);
    }

    /**
     * 导出反馈建议列表
     */
    @RequiresPermissions("blog:feedback:export")
    @Log(title = "反馈建议", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BlogFeedback blogFeedback)
    {
        List<BlogFeedback> list = blogFeedbackService.selectBlogFeedbackList(blogFeedback);
        ExcelUtil<BlogFeedback> util = new ExcelUtil<BlogFeedback>(BlogFeedback.class);
        return util.exportExcel(list, "feedback");
    }

    /**
     * 新增反馈建议
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存反馈建议
     */
    @RequiresPermissions("blog:feedback:add")
    @Log(title = "反馈建议", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BlogFeedback blogFeedback)
    {
        return toAjax(blogFeedbackService.insertBlogFeedback(blogFeedback));
    }

    /**
     * 修改反馈建议
     */
    @GetMapping("/edit/{feedId}")
    public String edit(@PathVariable("feedId") Long feedId, ModelMap mmap)
    {
        BlogFeedback blogFeedback = blogFeedbackService.selectBlogFeedbackById(feedId);
        mmap.put("blogFeedback", blogFeedback);
        return prefix + "/edit";
    }

    /**
     * 修改保存反馈建议
     */
    @RequiresPermissions("blog:feedback:edit")
    @Log(title = "反馈建议", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BlogFeedback blogFeedback)
    {
        return toAjax(blogFeedbackService.updateBlogFeedback(blogFeedback));
    }

    /**
     * 删除反馈建议
     */
    @RequiresPermissions("blog:feedback:remove")
    @Log(title = "反馈建议", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(blogFeedbackService.deleteBlogFeedbackByIds(ids));
    }
}
