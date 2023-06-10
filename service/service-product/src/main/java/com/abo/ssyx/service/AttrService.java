package com.abo.ssyx.service;


import com.abo.ssyx.model.product.Attr;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品属性 服务类
 * </p>
 *
 * @author lnb
 * @since 2023-06-10
 */
public interface AttrService extends IService<Attr> {
    //根据平台属性分组id查询
    List<Attr> getAttrListByGroupId(Long groupId);
}
