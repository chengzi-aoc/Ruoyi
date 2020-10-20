package com.ruoyi.system.service.blog;

import java.util.List;
import com.ruoyi.system.domain.blog.BlogAttention;

/**
 * 关注信息Service接口
 * 
 * @author admin
 * @date 2020-10-20
 */
public interface IBlogAttentionService 
{
    /**
     * 查询关注信息
     * 
     * @param id 关注信息ID
     * @return 关注信息
     */
    public BlogAttention selectBlogAttentionById(Long id);

    /**
     * 查询关注信息列表
     * 
     * @param blogAttention 关注信息
     * @return 关注信息集合
     */
    public List<BlogAttention> selectBlogAttentionList(BlogAttention blogAttention);

    /**
     * 新增关注信息
     * 
     * @param blogAttention 关注信息
     * @return 结果
     */
    public int insertBlogAttention(BlogAttention blogAttention);

    /**
     * 修改关注信息
     * 
     * @param blogAttention 关注信息
     * @return 结果
     */
    public int updateBlogAttention(BlogAttention blogAttention);

    /**
     * 批量删除关注信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogAttentionByIds(String ids);

    /**
     * 删除关注信息信息
     * 
     * @param id 关注信息ID
     * @return 结果
     */
    public int deleteBlogAttentionById(Long id);
}
