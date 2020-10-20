package com.ruoyi.system.domain.blog;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 博主信息对象 blog_user_info
 * 
 * @author ruoyi
 * @date 2020-10-20
 */
public class BlogUserInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 博主ID */
    private Long userId;

    /** 用户名 */
    @Excel(name = "用户名")
    private String blogUsername;

    /** 用户密码 */
    @Excel(name = "用户密码")
    private String blogPassword;

    /** 用户昵称 */
    @Excel(name = "用户昵称")
    private String blogNickname;

    /** 用户性别 */
    @Excel(name = "用户性别")
    private String blogSex;

    /** 用户qq号 */
    @Excel(name = "用户qq号")
    private String blogQq;

    /** 用户兴趣 */
    @Excel(name = "用户兴趣")
    private String blogInterest;

    /** 用户邮箱 */
    @Excel(name = "用户邮箱")
    private String blogEmail;

    /** 个性签名 */
    @Excel(name = "个性签名")
    private String blogStylename;

    /** 用户地址 */
    @Excel(name = "用户地址")
    private String blogAddress;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createUser;

    /** 删除标记：（0：未删除；1：已删除） */
    @Excel(name = "删除标记：", readConverterExp = "0=：未删除；1：已删除")
    private String deleteFlag;

    /** 修改时间 */
    @Excel(name = "修改时间")
    private String updateUser;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setBlogUsername(String blogUsername) 
    {
        this.blogUsername = blogUsername;
    }

    public String getBlogUsername() 
    {
        return blogUsername;
    }
    public void setBlogPassword(String blogPassword) 
    {
        this.blogPassword = blogPassword;
    }

    public String getBlogPassword() 
    {
        return blogPassword;
    }
    public void setBlogNickname(String blogNickname) 
    {
        this.blogNickname = blogNickname;
    }

    public String getBlogNickname() 
    {
        return blogNickname;
    }
    public void setBlogSex(String blogSex) 
    {
        this.blogSex = blogSex;
    }

    public String getBlogSex() 
    {
        return blogSex;
    }
    public void setBlogQq(String blogQq) 
    {
        this.blogQq = blogQq;
    }

    public String getBlogQq() 
    {
        return blogQq;
    }
    public void setBlogInterest(String blogInterest) 
    {
        this.blogInterest = blogInterest;
    }

    public String getBlogInterest() 
    {
        return blogInterest;
    }
    public void setBlogEmail(String blogEmail) 
    {
        this.blogEmail = blogEmail;
    }

    public String getBlogEmail() 
    {
        return blogEmail;
    }
    public void setBlogStylename(String blogStylename) 
    {
        this.blogStylename = blogStylename;
    }

    public String getBlogStylename() 
    {
        return blogStylename;
    }
    public void setBlogAddress(String blogAddress) 
    {
        this.blogAddress = blogAddress;
    }

    public String getBlogAddress() 
    {
        return blogAddress;
    }
    public void setCreateUser(String createUser) 
    {
        this.createUser = createUser;
    }

    public String getCreateUser() 
    {
        return createUser;
    }
    public void setDeleteFlag(String deleteFlag) 
    {
        this.deleteFlag = deleteFlag;
    }

    public String getDeleteFlag() 
    {
        return deleteFlag;
    }
    public void setUpdateUser(String updateUser) 
    {
        this.updateUser = updateUser;
    }

    public String getUpdateUser() 
    {
        return updateUser;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("blogUsername", getBlogUsername())
            .append("blogPassword", getBlogPassword())
            .append("blogNickname", getBlogNickname())
            .append("blogSex", getBlogSex())
            .append("blogQq", getBlogQq())
            .append("blogInterest", getBlogInterest())
            .append("blogEmail", getBlogEmail())
            .append("blogStylename", getBlogStylename())
            .append("blogAddress", getBlogAddress())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("deleteFlag", getDeleteFlag())
            .append("updateTime", getUpdateTime())
            .append("updateUser", getUpdateUser())
            .toString();
    }
}
