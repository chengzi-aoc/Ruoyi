package com.ruoyi.system.mapper.blog;

import java.util.List;
import com.ruoyi.system.domain.blog.BlogUserInfo;

/**
 * 博主信息Mapper接口
 * 
 * @author admin
 * @date 2020-10-20
 */
public interface BlogUserInfoMapper 
{
    /**
     * 查询博主信息
     * 
     * @param userId 博主信息ID
     * @return 博主信息
     */
    public BlogUserInfo selectBlogUserInfoById(Long userId);

    /**
     * 查询博主信息列表
     * 
     * @param blogUserInfo 博主信息
     * @return 博主信息集合
     */
    public List<BlogUserInfo> selectBlogUserInfoList(BlogUserInfo blogUserInfo);

    /**
     * 新增博主信息
     * 
     * @param blogUserInfo 博主信息
     * @return 结果
     */
    public int insertBlogUserInfo(BlogUserInfo blogUserInfo);

    /**
     * 修改博主信息
     * 
     * @param blogUserInfo 博主信息
     * @return 结果
     */
    public int updateBlogUserInfo(BlogUserInfo blogUserInfo);

    /**
     * 删除博主信息
     * 
     * @param userId 博主信息ID
     * @return 结果
     */
    public int deleteBlogUserInfoById(Long userId);

    /**
     * 批量删除博主信息
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogUserInfoByIds(String[] userIds);
}
