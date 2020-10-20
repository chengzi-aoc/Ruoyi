package com.ruoyi.system.service.blog.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.blog.BlogCommentReplyMapper;
import com.ruoyi.system.domain.blog.BlogCommentReply;
import com.ruoyi.system.service.blog.IBlogCommentReplyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 评论回复Service业务层处理
 * 
 * @author admin
 * @date 2020-10-20
 */
@Service
public class BlogCommentReplyServiceImpl implements IBlogCommentReplyService 
{
    @Autowired
    private BlogCommentReplyMapper blogCommentReplyMapper;

    /**
     * 查询评论回复
     * 
     * @param replyId 评论回复ID
     * @return 评论回复
     */
    @Override
    public BlogCommentReply selectBlogCommentReplyById(Long replyId)
    {
        return blogCommentReplyMapper.selectBlogCommentReplyById(replyId);
    }

    /**
     * 查询评论回复列表
     * 
     * @param blogCommentReply 评论回复
     * @return 评论回复
     */
    @Override
    public List<BlogCommentReply> selectBlogCommentReplyList(BlogCommentReply blogCommentReply)
    {
        return blogCommentReplyMapper.selectBlogCommentReplyList(blogCommentReply);
    }

    /**
     * 新增评论回复
     * 
     * @param blogCommentReply 评论回复
     * @return 结果
     */
    @Override
    public int insertBlogCommentReply(BlogCommentReply blogCommentReply)
    {
        return blogCommentReplyMapper.insertBlogCommentReply(blogCommentReply);
    }

    /**
     * 修改评论回复
     * 
     * @param blogCommentReply 评论回复
     * @return 结果
     */
    @Override
    public int updateBlogCommentReply(BlogCommentReply blogCommentReply)
    {
        return blogCommentReplyMapper.updateBlogCommentReply(blogCommentReply);
    }

    /**
     * 删除评论回复对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBlogCommentReplyByIds(String ids)
    {
        return blogCommentReplyMapper.deleteBlogCommentReplyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除评论回复信息
     * 
     * @param replyId 评论回复ID
     * @return 结果
     */
    @Override
    public int deleteBlogCommentReplyById(Long replyId)
    {
        return blogCommentReplyMapper.deleteBlogCommentReplyById(replyId);
    }
}
