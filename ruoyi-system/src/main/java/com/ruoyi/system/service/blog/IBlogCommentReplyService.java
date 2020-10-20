package com.ruoyi.system.service.blog;

import java.util.List;
import com.ruoyi.system.domain.blog.BlogCommentReply;

/**
 * 评论回复Service接口
 * 
 * @author admin
 * @date 2020-10-20
 */
public interface IBlogCommentReplyService 
{
    /**
     * 查询评论回复
     * 
     * @param replyId 评论回复ID
     * @return 评论回复
     */
    public BlogCommentReply selectBlogCommentReplyById(Long replyId);

    /**
     * 查询评论回复列表
     * 
     * @param blogCommentReply 评论回复
     * @return 评论回复集合
     */
    public List<BlogCommentReply> selectBlogCommentReplyList(BlogCommentReply blogCommentReply);

    /**
     * 新增评论回复
     * 
     * @param blogCommentReply 评论回复
     * @return 结果
     */
    public int insertBlogCommentReply(BlogCommentReply blogCommentReply);

    /**
     * 修改评论回复
     * 
     * @param blogCommentReply 评论回复
     * @return 结果
     */
    public int updateBlogCommentReply(BlogCommentReply blogCommentReply);

    /**
     * 批量删除评论回复
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogCommentReplyByIds(String ids);

    /**
     * 删除评论回复信息
     * 
     * @param replyId 评论回复ID
     * @return 结果
     */
    public int deleteBlogCommentReplyById(Long replyId);
}
