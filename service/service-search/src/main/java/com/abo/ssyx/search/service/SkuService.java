package com.abo.ssyx.search.service;

import com.abo.ssyx.model.search.SkuEs;
import com.abo.ssyx.vo.search.SkuEsQueryVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author lnb
 * @date 2023/6/11 15:55
 */
public interface SkuService {

    //上架
    void upperSku(Long skuId);

    //下架
    void lowerSku(Long skuId);

    //获取爆款商品
    List<SkuEs> findHotSkuList();

    //查询分类商品
    Page<SkuEs> search(Pageable pageable, SkuEsQueryVo skuEsQueryVo);

    //更新商品热度
    void incrHotScore(Long skuId);

}
