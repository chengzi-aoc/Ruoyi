package com.ruoyi.system.service.blog.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.blog.BlogUserInfoMapper;
import com.ruoyi.system.domain.blog.BlogUserInfo;
import com.ruoyi.system.service.blog.IBlogUserInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 博主信息Service业务层处理
 * 
 * @author admin
 * @date 2020-10-20
 */
@Service
public class BlogUserInfoServiceImpl implements IBlogUserInfoService 
{
    @Autowired
    private BlogUserInfoMapper blogUserInfoMapper;

    /**
     * 查询博主信息
     * 
     * @param userId 博主信息ID
     * @return 博主信息
     */
    @Override
    public BlogUserInfo selectBlogUserInfoById(Long userId)
    {
        return blogUserInfoMapper.selectBlogUserInfoById(userId);
    }

    /**
     * 查询博主信息列表
     * 
     * @param blogUserInfo 博主信息
     * @return 博主信息
     */
    @Override
    public List<BlogUserInfo> selectBlogUserInfoList(BlogUserInfo blogUserInfo)
    {
        return blogUserInfoMapper.selectBlogUserInfoList(blogUserInfo);
    }

    /**
     * 新增博主信息
     * 
     * @param blogUserInfo 博主信息
     * @return 结果
     */
    @Override
    public int insertBlogUserInfo(BlogUserInfo blogUserInfo)
    {
        blogUserInfo.setCreateTime(DateUtils.getNowDate());
        return blogUserInfoMapper.insertBlogUserInfo(blogUserInfo);
    }

    /**
     * 修改博主信息
     * 
     * @param blogUserInfo 博主信息
     * @return 结果
     */
    @Override
    public int updateBlogUserInfo(BlogUserInfo blogUserInfo)
    {
        blogUserInfo.setUpdateTime(DateUtils.getNowDate());
        return blogUserInfoMapper.updateBlogUserInfo(blogUserInfo);
    }

    /**
     * 删除博主信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBlogUserInfoByIds(String ids)
    {
        return blogUserInfoMapper.deleteBlogUserInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除博主信息信息
     * 
     * @param userId 博主信息ID
     * @return 结果
     */
    @Override
    public int deleteBlogUserInfoById(Long userId)
    {
        return blogUserInfoMapper.deleteBlogUserInfoById(userId);
    }
}
