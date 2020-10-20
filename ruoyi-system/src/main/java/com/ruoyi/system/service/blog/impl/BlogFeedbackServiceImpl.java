package com.ruoyi.system.service.blog.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.blog.BlogFeedbackMapper;
import com.ruoyi.system.domain.blog.BlogFeedback;
import com.ruoyi.system.service.blog.IBlogFeedbackService;
import com.ruoyi.common.core.text.Convert;

/**
 * 反馈建议Service业务层处理
 * 
 * @author admin
 * @date 2020-10-20
 */
@Service
public class BlogFeedbackServiceImpl implements IBlogFeedbackService 
{
    @Autowired
    private BlogFeedbackMapper blogFeedbackMapper;

    /**
     * 查询反馈建议
     * 
     * @param feedId 反馈建议ID
     * @return 反馈建议
     */
    @Override
    public BlogFeedback selectBlogFeedbackById(Long feedId)
    {
        return blogFeedbackMapper.selectBlogFeedbackById(feedId);
    }

    /**
     * 查询反馈建议列表
     * 
     * @param blogFeedback 反馈建议
     * @return 反馈建议
     */
    @Override
    public List<BlogFeedback> selectBlogFeedbackList(BlogFeedback blogFeedback)
    {
        return blogFeedbackMapper.selectBlogFeedbackList(blogFeedback);
    }

    /**
     * 新增反馈建议
     * 
     * @param blogFeedback 反馈建议
     * @return 结果
     */
    @Override
    public int insertBlogFeedback(BlogFeedback blogFeedback)
    {
        return blogFeedbackMapper.insertBlogFeedback(blogFeedback);
    }

    /**
     * 修改反馈建议
     * 
     * @param blogFeedback 反馈建议
     * @return 结果
     */
    @Override
    public int updateBlogFeedback(BlogFeedback blogFeedback)
    {
        return blogFeedbackMapper.updateBlogFeedback(blogFeedback);
    }

    /**
     * 删除反馈建议对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBlogFeedbackByIds(String ids)
    {
        return blogFeedbackMapper.deleteBlogFeedbackByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除反馈建议信息
     * 
     * @param feedId 反馈建议ID
     * @return 结果
     */
    @Override
    public int deleteBlogFeedbackById(Long feedId)
    {
        return blogFeedbackMapper.deleteBlogFeedbackById(feedId);
    }
}
