package com.ruoyi.system.domain.blog;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 收藏对象 blog_collect
 * 
 * @author ruoyi
 * @date 2020-10-20
 */
public class BlogCollect extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long collectId;

    /** 所属用户id */
    @Excel(name = "所属用户id")
    private Long collectUserId;

    /** 文章id */
    @Excel(name = "文章id")
    private Long articleId;

    /** 收藏人 */
    @Excel(name = "收藏人")
    private String createUser;

    /** 删除标记（0：未删除；1：已删除） */
    @Excel(name = "删除标记", readConverterExp = "0=：未删除；1：已删除")
    private String deleteFlag;

    public void setCollectId(Long collectId) 
    {
        this.collectId = collectId;
    }

    public Long getCollectId() 
    {
        return collectId;
    }
    public void setCollectUserId(Long collectUserId) 
    {
        this.collectUserId = collectUserId;
    }

    public Long getCollectUserId() 
    {
        return collectUserId;
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
    public void setDeleteFlag(String deleteFlag) 
    {
        this.deleteFlag = deleteFlag;
    }

    public String getDeleteFlag() 
    {
        return deleteFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("collectId", getCollectId())
            .append("collectUserId", getCollectUserId())
            .append("articleId", getArticleId())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
