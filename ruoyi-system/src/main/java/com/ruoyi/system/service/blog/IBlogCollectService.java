package com.ruoyi.system.service.blog;

import java.util.List;
import com.ruoyi.system.domain.blog.BlogCollect;

/**
 * 收藏Service接口
 * 
 * @author admin
 * @date 2020-10-20
 */
public interface IBlogCollectService 
{
    /**
     * 查询收藏
     * 
     * @param collectId 收藏ID
     * @return 收藏
     */
    public BlogCollect selectBlogCollectById(Long collectId);

    /**
     * 查询收藏列表
     * 
     * @param blogCollect 收藏
     * @return 收藏集合
     */
    public List<BlogCollect> selectBlogCollectList(BlogCollect blogCollect);

    /**
     * 新增收藏
     * 
     * @param blogCollect 收藏
     * @return 结果
     */
    public int insertBlogCollect(BlogCollect blogCollect);

    /**
     * 修改收藏
     * 
     * @param blogCollect 收藏
     * @return 结果
     */
    public int updateBlogCollect(BlogCollect blogCollect);

    /**
     * 批量删除收藏
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBlogCollectByIds(String ids);

    /**
     * 删除收藏信息
     * 
     * @param collectId 收藏ID
     * @return 结果
     */
    public int deleteBlogCollectById(Long collectId);
}
