package com.ruoyi.system.service.blog;

import java.util.List;
import com.ruoyi.system.domain.blog.BlogArticleInfo;

/**
 * 文章内容信息Service接口
 * 
 * @author admin
 * @date 2020-10-20
 */
public interface IBlogArticleInfoService 
{
    /**
     * 查询文章内容信息
     * 
     * @param articleId 文章内容信息ID
     * @return 文章内容信息
     */
    public BlogArticleInfo selectBlogArticleInfoById(Long articleId);

    /**
     * 查询文章内容信息列表
     * 
     * @param blogArticleInfo 文章内容信息
     * @return 文章内容信息集合
     */
    public List<BlogArticleInfo> selectBlogArticleInfoList(BlogArticleInfo blogArticleInfo);

    /**
     * 新增文章内容信息
     * 
     * @param blogArticleInfo 文章内容信息
     * @return 结果
     */
    public int insertBlogArticleInfo(BlogArticleInfo blogArticleInfo);

    /**
     * 修改文章内容信息
     * 
     * @param blogArticleInfo 文章内容信息
     * @return 结果
     */
    public int updateBlogArticleInfo(BlogArticleInfo blogArticleInfo);

    /**
     * 批量删除文章内容信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogArticleInfoByIds(String ids);

    /**
     * 删除文章内容信息信息
     * 
     * @param articleId 文章内容信息ID
     * @return 结果
     */
    public int deleteBlogArticleInfoById(Long articleId);
}
