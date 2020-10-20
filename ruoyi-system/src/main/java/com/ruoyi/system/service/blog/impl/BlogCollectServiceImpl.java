package com.ruoyi.system.service.blog.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.blog.BlogCollectMapper;
import com.ruoyi.system.domain.blog.BlogCollect;
import com.ruoyi.system.service.blog.IBlogCollectService;
import com.ruoyi.common.core.text.Convert;

/**
 * 收藏Service业务层处理
 * 
 * @author admin
 * @date 2020-10-20
 */
@Service
public class BlogCollectServiceImpl implements IBlogCollectService 
{
    @Autowired
    private BlogCollectMapper blogCollectMapper;

    /**
     * 查询收藏
     * 
     * @param collectId 收藏ID
     * @return 收藏
     */
    @Override
    public BlogCollect selectBlogCollectById(Long collectId)
    {
        return blogCollectMapper.selectBlogCollectById(collectId);
    }

    /**
     * 查询收藏列表
     * 
     * @param blogCollect 收藏
     * @return 收藏
     */
    @Override
    public List<BlogCollect> selectBlogCollectList(BlogCollect blogCollect)
    {
        return blogCollectMapper.selectBlogCollectList(blogCollect);
    }

    /**
     * 新增收藏
     * 
     * @param blogCollect 收藏
     * @return 结果
     */
    @Override
    public int insertBlogCollect(BlogCollect blogCollect)
    {
        blogCollect.setCreateTime(DateUtils.getNowDate());
        return blogCollectMapper.insertBlogCollect(blogCollect);
    }

    /**
     * 修改收藏
     * 
     * @param blogCollect 收藏
     * @return 结果
     */
    @Override
    public int updateBlogCollect(BlogCollect blogCollect)
    {
        return blogCollectMapper.updateBlogCollect(blogCollect);
    }

    /**
     * 删除收藏对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBlogCollectByIds(String ids)
    {
        return blogCollectMapper.deleteBlogCollectByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除收藏信息
     * 
     * @param collectId 收藏ID
     * @return 结果
     */
    @Override
    public int deleteBlogCollectById(Long collectId)
    {
        return blogCollectMapper.deleteBlogCollectById(collectId);
    }
}
