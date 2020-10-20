package com.ruoyi.system.mapper.blog;

import java.util.List;
import com.ruoyi.system.domain.blog.BlogLike;

/**
 * 点赞Mapper接口
 * 
 * @author admin
 * @date 2020-10-20
 */
public interface BlogLikeMapper 
{
    /**
     * 查询点赞
     * 
     * @param likeId 点赞ID
     * @return 点赞
     */
    public BlogLike selectBlogLikeById(Long likeId);

    /**
     * 查询点赞列表
     * 
     * @param blogLike 点赞
     * @return 点赞集合
     */
    public List<BlogLike> selectBlogLikeList(BlogLike blogLike);

    /**
     * 新增点赞
     * 
     * @param blogLike 点赞
     * @return 结果
     */
    public int insertBlogLike(BlogLike blogLike);

    /**
     * 修改点赞
     * 
     * @param blogLike 点赞
     * @return 结果
     */
    public int updateBlogLike(BlogLike blogLike);

    /**
     * 删除点赞
     * 
     * @param likeId 点赞ID
     * @return 结果
     */
    public int deleteBlogLikeById(Long likeId);

    /**
     * 批量删除点赞
     * 
     * @param likeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogLikeByIds(String[] likeIds);
}
