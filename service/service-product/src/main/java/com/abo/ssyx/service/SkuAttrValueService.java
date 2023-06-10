package com.abo.ssyx.service;


import com.abo.ssyx.model.product.SkuAttrValue;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * spu属性值 服务类
 * </p>
 *
 * @author lnb
 * @since 2023-06-10
 */
public interface SkuAttrValueService extends IService<SkuAttrValue> {
    //根据id查询商品属性信息列表
    List<SkuAttrValue> getAttrValueListBySkuId(Long id);
}
