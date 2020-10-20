package com.ruoyi.system.domain.blog;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 友情链接对象 blog_link
 * 
 * @author ruoyi
 * @date 2020-10-20
 */
public class BlogLink extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long linkId;

    /** 所属用户id */
    @Excel(name = "所属用户id")
    private Long linkUserId;

    /** 文章id */
    @Excel(name = "文章id")
    private Long articleId;

    /** 链接名称 */
    @Excel(name = "链接名称")
    private String linkName;

    /** 链接URL */
    @Excel(name = "链接URL")
    private String linkUrl;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createUser;

    public void setLinkId(Long linkId) 
    {
        this.linkId = linkId;
    }

    public Long getLinkId() 
    {
        return linkId;
    }
    public void setLinkUserId(Long linkUserId) 
    {
        this.linkUserId = linkUserId;
    }

    public Long getLinkUserId() 
    {
        return linkUserId;
    }
    public void setArticleId(Long articleId) 
    {
        this.articleId = articleId;
    }

    public Long getArticleId() 
    {
        return articleId;
    }
    public void setLinkName(String linkName) 
    {
        this.linkName = linkName;
    }

    public String getLinkName() 
    {
        return linkName;
    }
    public void setLinkUrl(String linkUrl) 
    {
        this.linkUrl = linkUrl;
    }

    public String getLinkUrl() 
    {
        return linkUrl;
    }
    public void setCreateUser(String createUser) 
    {
        this.createUser = createUser;
    }

    public String getCreateUser() 
    {
        return createUser;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("linkId", getLinkId())
            .append("linkUserId", getLinkUserId())
            .append("articleId", getArticleId())
            .append("linkName", getLinkName())
            .append("linkUrl", getLinkUrl())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .toString();
    }
}
