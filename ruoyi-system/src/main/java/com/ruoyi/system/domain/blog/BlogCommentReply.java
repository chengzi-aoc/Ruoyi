package com.ruoyi.system.domain.blog;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评论回复对象 blog_comment_reply
 * 
 * @author ruoyi
 * @date 2020-10-20
 */
public class BlogCommentReply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long replyId;

    /** 所属用户id */
    @Excel(name = "所属用户id")
    private Long replyUserId;

    /** 文章编号 */
    @Excel(name = "文章编号")
    private Long replyNumber;

    /** 内容 */
    @Excel(name = "内容")
    private String replyContent;

    /** 发表时间 */
    @Excel(name = "发表时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publicTime;

    /** 访问次数 */
    @Excel(name = "访问次数")
    private Integer visitNumber;

    public void setReplyId(Long replyId) 
    {
        this.replyId = replyId;
    }

    public Long getReplyId() 
    {
        return replyId;
    }
    public void setReplyUserId(Long replyUserId) 
    {
        this.replyUserId = replyUserId;
    }

    public Long getReplyUserId() 
    {
        return replyUserId;
    }
    public void setReplyNumber(Long replyNumber) 
    {
        this.replyNumber = replyNumber;
    }

    public Long getReplyNumber() 
    {
        return replyNumber;
    }
    public void setReplyContent(String replyContent) 
    {
        this.replyContent = replyContent;
    }

    public String getReplyContent() 
    {
        return replyContent;
    }
    public void setPublicTime(Date publicTime) 
    {
        this.publicTime = publicTime;
    }

    public Date getPublicTime() 
    {
        return publicTime;
    }
    public void setVisitNumber(Integer visitNumber) 
    {
        this.visitNumber = visitNumber;
    }

    public Integer getVisitNumber() 
    {
        return visitNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("replyId", getReplyId())
            .append("replyUserId", getReplyUserId())
            .append("replyNumber", getReplyNumber())
            .append("replyContent", getReplyContent())
            .append("publicTime", getPublicTime())
            .append("visitNumber", getVisitNumber())
            .toString();
    }
}
