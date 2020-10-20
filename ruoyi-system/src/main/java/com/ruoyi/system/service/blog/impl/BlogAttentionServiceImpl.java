package com.ruoyi.system.service.blog.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.blog.BlogAttentionMapper;
import com.ruoyi.system.domain.blog.BlogAttention;
import com.ruoyi.system.service.blog.IBlogAttentionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 关注信息Service业务层处理
 * 
 * @author admin
 * @date 2020-10-20
 */
@Service
public class BlogAttentionServiceImpl implements IBlogAttentionService 
{
    @Autowired
    private BlogAttentionMapper blogAttentionMapper;

    /**
     * 查询关注信息
     * 
     * @param id 关注信息ID
     * @return 关注信息
     */
    @Override
    public BlogAttention selectBlogAttentionById(Long id)
    {
        return blogAttentionMapper.selectBlogAttentionById(id);
    }

    /**
     * 查询关注信息列表
     * 
     * @param blogAttention 关注信息
     * @return 关注信息
     */
    @Override
    public List<BlogAttention> selectBlogAttentionList(BlogAttention blogAttention)
    {
        return blogAttentionMapper.selectBlogAttentionList(blogAttention);
    }

    /**
     * 新增关注信息
     * 
     * @param blogAttention 关注信息
     * @return 结果
     */
    @Override
    public int insertBlogAttention(BlogAttention blogAttention)
    {
        blogAttention.setCreateTime(DateUtils.getNowDate());
        return blogAttentionMapper.insertBlogAttention(blogAttention);
    }

    /**
     * 修改关注信息
     * 
     * @param blogAttention 关注信息
     * @return 结果
     */
    @Override
    public int updateBlogAttention(BlogAttention blogAttention)
    {
        return blogAttentionMapper.updateBlogAttention(blogAttention);
    }

    /**
     * 删除关注信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBlogAttentionByIds(String ids)
    {
        return blogAttentionMapper.deleteBlogAttentionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除关注信息信息
     * 
     * @param id 关注信息ID
     * @return 结果
     */
    @Override
    public int deleteBlogAttentionById(Long id)
    {
        return blogAttentionMapper.deleteBlogAttentionById(id);
    }
}
