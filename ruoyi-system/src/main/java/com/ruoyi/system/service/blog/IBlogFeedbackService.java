package com.ruoyi.system.service.blog;

import java.util.List;
import com.ruoyi.system.domain.blog.BlogFeedback;

/**
 * 反馈建议Service接口
 * 
 * @author admin
 * @date 2020-10-20
 */
public interface IBlogFeedbackService 
{
    /**
     * 查询反馈建议
     * 
     * @param feedId 反馈建议ID
     * @return 反馈建议
     */
    public BlogFeedback selectBlogFeedbackById(Long feedId);

    /**
     * 查询反馈建议列表
     * 
     * @param blogFeedback 反馈建议
     * @return 反馈建议集合
     */
    public List<BlogFeedback> selectBlogFeedbackList(BlogFeedback blogFeedback);

    /**
     * 新增反馈建议
     * 
     * @param blogFeedback 反馈建议
     * @return 结果
     */
    public int insertBlogFeedback(BlogFeedback blogFeedback);

    /**
     * 修改反馈建议
     * 
     * @param blogFeedback 反馈建议
     * @return 结果
     */
    public int updateBlogFeedback(BlogFeedback blogFeedback);

    /**
     * 批量删除反馈建议
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogFeedbackByIds(String ids);

    /**
     * 删除反馈建议信息
     * 
     * @param feedId 反馈建议ID
     * @return 结果
     */
    public int deleteBlogFeedbackById(Long feedId);
}
