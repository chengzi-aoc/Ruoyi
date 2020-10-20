package com.ruoyi.system.mapper.blog;

import java.util.List;
import com.ruoyi.system.domain.blog.BlogLink;

/**
 * 友情链接Mapper接口
 * 
 * @author admin
 * @date 2020-10-20
 */
public interface BlogLinkMapper 
{
    /**
     * 查询友情链接
     * 
     * @param linkId 友情链接ID
     * @return 友情链接
     */
    public BlogLink selectBlogLinkById(Long linkId);

    /**
     * 查询友情链接列表
     * 
     * @param blogLink 友情链接
     * @return 友情链接集合
     */
    public List<BlogLink> selectBlogLinkList(BlogLink blogLink);

    /**
     * 新增友情链接
     * 
     * @param blogLink 友情链接
     * @return 结果
     */
    public int insertBlogLink(BlogLink blogLink);

    /**
     * 修改友情链接
     * 
     * @param blogLink 友情链接
     * @return 结果
     */
    public int updateBlogLink(BlogLink blogLink);

    /**
     * 删除友情链接
     * 
     * @param linkId 友情链接ID
     * @return 结果
     */
    public int deleteBlogLinkById(Long linkId);

    /**
     * 批量删除友情链接
     * 
     * @param linkIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogLinkByIds(String[] linkIds);
}
