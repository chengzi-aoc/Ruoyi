package com.ruoyi.system.domain.blog;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 关注信息对象 blog_attention
 * 
 * @author ruoyi
 * @date 2020-10-20
 */
public class BlogAttention extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 所属用户id */
    @Excel(name = "所属用户id")
    private Long userId;

    /** 关注人id */
    @Excel(name = "关注人id")
    private Long attentionId;

    /** 关注人姓名 */
    @Excel(name = "关注人姓名")
    private String attentionName;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createUser;

    /** 删除标记（0：未删除；1：已删除） */
    @Excel(name = "删除标记", readConverterExp = "0=：未删除；1：已删除")
    private String deleteFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setAttentionId(Long attentionId) 
    {
        this.attentionId = attentionId;
    }

    public Long getAttentionId() 
    {
        return attentionId;
    }
    public void setAttentionName(String attentionName) 
    {
        this.attentionName = attentionName;
    }

    public String getAttentionName() 
    {
        return attentionName;
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
            .append("id", getId())
            .append("userId", getUserId())
            .append("attentionId", getAttentionId())
            .append("attentionName", getAttentionName())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
