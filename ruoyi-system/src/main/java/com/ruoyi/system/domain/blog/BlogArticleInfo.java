package com.ruoyi.system.domain.blog;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文章内容信息对象 blog_article_info
 *
 * @author ruoyi
 * @date 2020-11-30
 */
public class BlogArticleInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 文章id */
    private Long articleId;

    /** 文章所属用户id */
    @Excel(name = "文章所属用户id")
    private Long articleUserId;

    /** 文章名称 */
    @Excel(name = "文章名称")
    private String articleName;

    /** 文章标签(字典数据) */
    @Excel(name = "文章标签")
    private String articleLabel;

    /** 文章摘要 */
    @Excel(name = "文章摘要")
    private String articleAbstract;

    /** 文章主题内容 */
    @Excel(name = "文章主题内容")
    private String articleContent;

    /** 状态(0：显示；1：隐藏) */
    @Excel(name = "状态",readConverterExp = "0=：显示；1：隐藏")
    private String status;

    /** 是否原创（0：是；1：不是） */
    @Excel(name = "是否原创", readConverterExp = "0=：是；1：不是")
    private String articleOriiginal;

    /** 访问次数 */
    @Excel(name = "访问次数")
    private Integer visitNumber;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createUser;

    /** 删除标记（0：未删除；1：已删除） */
    @Excel(name = "删除标记", readConverterExp = "0=：未删除；1：已删除")
    private String deleteFlag;

    /** 修改人 */
    @Excel(name = "修改人")
    private String updateUser;

    public void setArticleId(Long articleId)
    {
        this.articleId = articleId;
    }

    public Long getArticleId()
    {
        return articleId;
    }
    public void setArticleUserId(Long articleUserId)
    {
        this.articleUserId = articleUserId;
    }

    public Long getArticleUserId()
    {
        return articleUserId;
    }
    public void setArticleName(String articleName)
    {
        this.articleName = articleName;
    }

    public String getArticleName()
    {
        return articleName;
    }
    public void setArticleLabel(String articleLabel)
    {
        this.articleLabel = articleLabel;
    }

    public String getArticleLabel()
    {
        return articleLabel;
    }
    public void setArticleAbstract(String articleAbstract)
    {
        this.articleAbstract = articleAbstract;
    }

    public String getArticleAbstract()
    {
        return articleAbstract;
    }
    public void setArticleContent(String articleContent)
    {
        this.articleContent = articleContent;
    }

    public String getArticleContent()
    {
        return articleContent;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setArticleOriiginal(String articleOriiginal)
    {
        this.articleOriiginal = articleOriiginal;
    }

    public String getArticleOriiginal()
    {
        return articleOriiginal;
    }
    public void setVisitNumber(Integer visitNumber)
    {
        this.visitNumber = visitNumber;
    }

    public Integer getVisitNumber()
    {
        return visitNumber;
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
                .append("articleId", getArticleId())
                .append("articleUserId", getArticleUserId())
                .append("articleName", getArticleName())
                .append("articleLabel", getArticleLabel())
                .append("articleAbstract", getArticleAbstract())
                .append("articleContent", getArticleContent())
                .append("status", getStatus())
                .append("articleOriiginal", getArticleOriiginal())
                .append("visitNumber", getVisitNumber())
                .append("createUser", getCreateUser())
                .append("createTime", getCreateTime())
                .append("deleteFlag", getDeleteFlag())
                .append("updateUser", getUpdateUser())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}