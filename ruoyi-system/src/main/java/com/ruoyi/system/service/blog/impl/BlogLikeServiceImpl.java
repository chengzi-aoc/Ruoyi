package com.ruoyi.system.service.blog.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.blog.BlogLikeMapper;
import com.ruoyi.system.domain.blog.BlogLike;
import com.ruoyi.system.service.blog.IBlogLikeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 点赞Service业务层处理
 * 
 * @author admin
 * @date 2020-10-20
 */
@Service
public class BlogLikeServiceImpl implements IBlogLikeService 
{
    @Autowired
    private BlogLikeMapper blogLikeMapper;

    /**
     * 查询点赞
     * 
     * @param likeId 点赞ID
     * @return 点赞
     */
    @Override
    public BlogLike selectBlogLikeById(Long likeId)
    {
        return blogLikeMapper.selectBlogLikeById(likeId);
    }

    /**
     * 查询点赞列表
     * 
     * @param blogLike 点赞
     * @return 点赞
     */
    @Override
    public List<BlogLike> selectBlogLikeList(BlogLike blogLike)
    {
        return blogLikeMapper.selectBlogLikeList(blogLike);
    }

    /**
     * 新增点赞
     * 
     * @param blogLike 点赞
     * @return 结果
     */
    @Override
    public int insertBlogLike(BlogLike blogLike)
    {
        blogLike.setCreateTime(DateUtils.getNowDate());
        return blogLikeMapper.insertBlogLike(blogLike);
    }

    /**
     * 修改点赞
     * 
     * @param blogLike 点赞
     * @return 结果
     */
    @Override
    public int updateBlogLike(BlogLike blogLike)
    {
        return blogLikeMapper.updateBlogLike(blogLike);
    }

    /**
     * 删除点赞对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBlogLikeByIds(String ids)
    {
        return blogLikeMapper.deleteBlogLikeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除点赞信息
     * 
     * @param likeId 点赞ID
     * @return 结果
     */
    @Override
    public int deleteBlogLikeById(Long likeId)
    {
        return blogLikeMapper.deleteBlogLikeById(likeId);
    }
}
