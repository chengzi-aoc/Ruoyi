package com.ruoyi.system.domain.blog;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 点赞对象 blog_like
 * 
 * @author ruoyi
 * @date 2020-10-20
 */
public class BlogLike extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long likeId;

    /** 所属用户id */
    @Excel(name = "所属用户id")
    private Long likeUserId;

    /** 文章id */
    @Excel(name = "文章id")
    private Long articleId;

    /** 点赞人 */
    @Excel(name = "点赞人")
    private String createUser;

    public void setLikeId(Long likeId) 
    {
        this.likeId = likeId;
    }

    public Long getLikeId() 
    {
        return likeId;
    }
    public void setLikeUserId(Long likeUserId) 
    {
        this.likeUserId = likeUserId;
    }

    public Long getLikeUserId() 
    {
        return likeUserId;
    }
    public void setArticleId(Long articleId) 
    {
        this.articleId = articleId;
    }

    public Long getArticleId() 
    {
        return articleId;
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
            .append("likeId", getLikeId())
            .append("likeUserId", getLikeUserId())
            .append("articleId", getArticleId())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .toString();
    }
}
