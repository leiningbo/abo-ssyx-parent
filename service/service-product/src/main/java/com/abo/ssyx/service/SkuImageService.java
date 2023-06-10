package com.abo.ssyx.service;


import com.abo.ssyx.model.product.SkuImage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品图片 服务类
 * </p>
 *
 * @author lnb
 * @since 2023-06-10
 */
public interface SkuImageService extends IService<SkuImage> {
    //根据id查询商品图片列表
    List<SkuImage> getImageListBySkuId(Long id);
}
