package com.ruoyi.system.service.blog.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.blog.BlogArticleInfoMapper;
import com.ruoyi.system.domain.blog.BlogArticleInfo;
import com.ruoyi.system.service.blog.IBlogArticleInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 文章内容信息Service业务层处理
 * 
 * @author admin
 * @date 2020-10-20
 */
@Service
public class BlogArticleInfoServiceImpl implements IBlogArticleInfoService 
{
    @Autowired
    private BlogArticleInfoMapper blogArticleInfoMapper;

    /**
     * 查询文章内容信息
     * 
     * @param articleId 文章内容信息ID
     * @return 文章内容信息
     */
    @Override
    public BlogArticleInfo selectBlogArticleInfoById(Long articleId)
    {
        return blogArticleInfoMapper.selectBlogArticleInfoById(articleId);
    }

    /**
     * 查询文章内容信息列表
     * 
     * @param blogArticleInfo 文章内容信息
     * @return 文章内容信息
     */
    @Override
    public List<BlogArticleInfo> selectBlogArticleInfoList(BlogArticleInfo blogArticleInfo)
    {
        return blogArticleInfoMapper.selectBlogArticleInfoList(blogArticleInfo);
    }

    /**
     * 新增文章内容信息
     * 
     * @param blogArticleInfo 文章内容信息
     * @return 结果
     */
    @Override
    public int insertBlogArticleInfo(BlogArticleInfo blogArticleInfo)
    {
        blogArticleInfo.setCreateTime(DateUtils.getNowDate());
        return blogArticleInfoMapper.insertBlogArticleInfo(blogArticleInfo);
    }

    /**
     * 修改文章内容信息
     * 
     * @param blogArticleInfo 文章内容信息
     * @return 结果
     */
    @Override
    public int updateBlogArticleInfo(BlogArticleInfo blogArticleInfo)
    {
        blogArticleInfo.setUpdateTime(DateUtils.getNowDate());
        return blogArticleInfoMapper.updateBlogArticleInfo(blogArticleInfo);
    }

    /**
     * 删除文章内容信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBlogArticleInfoByIds(String ids)
    {
        return blogArticleInfoMapper.deleteBlogArticleInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除文章内容信息信息
     * 
     * @param articleId 文章内容信息ID
     * @return 结果
     */
    @Override
    public int deleteBlogArticleInfoById(Long articleId)
    {
        return blogArticleInfoMapper.deleteBlogArticleInfoById(articleId);
    }
}
