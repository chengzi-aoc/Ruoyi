package com.ruoyi.system.domain.blog;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 反馈建议对象 blog_feedback
 * 
 * @author ruoyi
 * @date 2020-10-20
 */
public class BlogFeedback extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long feedId;

    /** 所属用户id */
    @Excel(name = "所属用户id")
    private Long feedUserId;

    /** 反馈内容 */
    @Excel(name = "反馈内容")
    private String feedContent;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private Long feedContact;

    /** 发表时间 */
    @Excel(name = "发表时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publicTime;

    public void setFeedId(Long feedId) 
    {
        this.feedId = feedId;
    }

    public Long getFeedId() 
    {
        return feedId;
    }
    public void setFeedUserId(Long feedUserId) 
    {
        this.feedUserId = feedUserId;
    }

    public Long getFeedUserId() 
    {
        return feedUserId;
    }
    public void setFeedContent(String feedContent) 
    {
        this.feedContent = feedContent;
    }

    public String getFeedContent() 
    {
        return feedContent;
    }
    public void setFeedContact(Long feedContact) 
    {
        this.feedContact = feedContact;
    }

    public Long getFeedContact() 
    {
        return feedContact;
    }
    public void setPublicTime(Date publicTime) 
    {
        this.publicTime = publicTime;
    }

    public Date getPublicTime() 
    {
        return publicTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("feedId", getFeedId())
            .append("feedUserId", getFeedUserId())
            .append("feedContent", getFeedContent())
            .append("feedContact", getFeedContact())
            .append("publicTime", getPublicTime())
            .toString();
    }
}
