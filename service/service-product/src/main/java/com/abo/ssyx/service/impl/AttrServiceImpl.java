package com.abo.ssyx.service.impl;


import com.abo.ssyx.model.product.Attr;
import com.abo.ssyx.mapper.AttrMapper;
import com.abo.ssyx.service.AttrService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品属性 服务实现类
 * </p>
 *
 * @author lnb
 * @since 2023-06-10
 */
@Service
public class AttrServiceImpl extends ServiceImpl<AttrMapper, Attr> implements AttrService {

    //根据平台属性分组id查询
    @Override
    public List<Attr> getAttrListByGroupId(Long groupId) {
        LambdaQueryWrapper<Attr> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Attr::getAttrGroupId,groupId);
        List<Attr> list = baseMapper.selectList(wrapper);
        return list;
    }
}
