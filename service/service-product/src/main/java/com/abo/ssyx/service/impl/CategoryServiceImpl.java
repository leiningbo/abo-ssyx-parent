package com.abo.ssyx.service.impl;


import com.abo.ssyx.model.product.Category;
import com.abo.ssyx.vo.product.CategoryQueryVo;
import com.abo.ssyx.mapper.CategoryMapper;
import com.abo.ssyx.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author lnb
 * @since 2023-06-10
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    //商品分类列表
    @Override
    public IPage<Category> selectPageCategory(Page<Category> pageParam,
                                              CategoryQueryVo categoryQueryVo) {
        String name = categoryQueryVo.getName();
        LambdaQueryWrapper<Category> wrapper = new LambdaQueryWrapper<>();
        if(!StringUtils.isEmpty(name)) {
            wrapper.like(Category::getName,name);
        }
        IPage<Category> categoryPage = baseMapper.selectPage(pageParam, wrapper);
        return categoryPage;
    }
}
