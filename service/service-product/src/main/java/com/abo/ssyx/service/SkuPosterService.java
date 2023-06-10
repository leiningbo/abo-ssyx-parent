package com.abo.ssyx.service;


import com.abo.ssyx.model.product.SkuPoster;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品海报表 服务类
 * </p>
 *
 * @author lnb
 * @since 2023-06-10
 */
public interface SkuPosterService extends IService<SkuPoster> {
    //根据id查询商品海报列表
    List<SkuPoster> getPosterListBySkuId(Long id);
}
