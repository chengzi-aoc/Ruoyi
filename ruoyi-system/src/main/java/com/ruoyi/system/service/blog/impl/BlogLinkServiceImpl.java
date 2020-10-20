package com.ruoyi.system.service.blog.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.blog.BlogLinkMapper;
import com.ruoyi.system.domain.blog.BlogLink;
import com.ruoyi.system.service.blog.IBlogLinkService;
import com.ruoyi.common.core.text.Convert;

/**
 * 友情链接Service业务层处理
 * 
 * @author admin
 * @date 2020-10-20
 */
@Service
public class BlogLinkServiceImpl implements IBlogLinkService 
{
    @Autowired
    private BlogLinkMapper blogLinkMapper;

    /**
     * 查询友情链接
     * 
     * @param linkId 友情链接ID
     * @return 友情链接
     */
    @Override
    public BlogLink selectBlogLinkById(Long linkId)
    {
        return blogLinkMapper.selectBlogLinkById(linkId);
    }

    /**
     * 查询友情链接列表
     * 
     * @param blogLink 友情链接
     * @return 友情链接
     */
    @Override
    public List<BlogLink> selectBlogLinkList(BlogLink blogLink)
    {
        return blogLinkMapper.selectBlogLinkList(blogLink);
    }

    /**
     * 新增友情链接
     * 
     * @param blogLink 友情链接
     * @return 结果
     */
    @Override
    public int insertBlogLink(BlogLink blogLink)
    {
        blogLink.setCreateTime(DateUtils.getNowDate());
        return blogLinkMapper.insertBlogLink(blogLink);
    }

    /**
     * 修改友情链接
     * 
     * @param blogLink 友情链接
     * @return 结果
     */
    @Override
    public int updateBlogLink(BlogLink blogLink)
    {
        return blogLinkMapper.updateBlogLink(blogLink);
    }

    /**
     * 删除友情链接对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBlogLinkByIds(String ids)
    {
        return blogLinkMapper.deleteBlogLinkByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除友情链接信息
     * 
     * @param linkId 友情链接ID
     * @return 结果
     */
    @Override
    public int deleteBlogLinkById(Long linkId)
    {
        return blogLinkMapper.deleteBlogLinkById(linkId);
    }
}
