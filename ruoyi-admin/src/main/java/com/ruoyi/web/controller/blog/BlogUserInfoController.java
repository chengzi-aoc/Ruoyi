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
import com.ruoyi.system.domain.blog.BlogUserInfo;
import com.ruoyi.system.service.blog.IBlogUserInfoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 博主信息Controller
 * 
 * @author admin
 * @date 2020-10-20
 */
@Controller
@RequestMapping("/blog/user")
public class BlogUserInfoController extends BaseController
{
    private String prefix = "blog/user";

    @Autowired
    private IBlogUserInfoService blogUserInfoService;

    @RequiresPermissions("blog:user:view")
    @GetMapping()
    public String info()
    {
        return prefix + "/user";
    }

    /**
     * 查询博主信息列表
     */
    @RequiresPermissions("blog:user:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BlogUserInfo blogUserInfo)
    {
        startPage();
        List<BlogUserInfo> list = blogUserInfoService.selectBlogUserInfoList(blogUserInfo);
        return getDataTable(list);
    }

    /**
     * 导出博主信息列表
     */
    @RequiresPermissions("blog:user:export")
    @Log(title = "博主信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BlogUserInfo blogUserInfo)
    {
        List<BlogUserInfo> list = blogUserInfoService.selectBlogUserInfoList(blogUserInfo);
        ExcelUtil<BlogUserInfo> util = new ExcelUtil<BlogUserInfo>(BlogUserInfo.class);
        return util.exportExcel(list, "user");
    }

    /**
     * 新增博主信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存博主信息
     */
    @RequiresPermissions("blog:user:add")
    @Log(title = "博主信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BlogUserInfo blogUserInfo)
    {
        return toAjax(blogUserInfoService.insertBlogUserInfo(blogUserInfo));
    }

    /**
     * 修改博主信息
     */
    @GetMapping("/edit/{userId}")
    public String edit(@PathVariable("userId") Long userId, ModelMap mmap)
    {
        BlogUserInfo blogUserInfo = blogUserInfoService.selectBlogUserInfoById(userId);
        mmap.put("blogUserInfo", blogUserInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存博主信息
     */
    @RequiresPermissions("blog:user:edit")
    @Log(title = "博主信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BlogUserInfo blogUserInfo)
    {
        return toAjax(blogUserInfoService.updateBlogUserInfo(blogUserInfo));
    }

    /**
     * 删除博主信息
     */
    @RequiresPermissions("blog:user:remove")
    @Log(title = "博主信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(blogUserInfoService.deleteBlogUserInfoByIds(ids));
    }
}
