package com.abo.ssyx.controller;

import com.abo.ssyx.common.result.Result;
import com.abo.ssyx.model.sys.Ware;
import com.abo.ssyx.service.WareService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lnb
 * @date 2023/6/9 15:41
 */
@RestController
@RequestMapping("/admin/sys/ware")
@CrossOrigin
public class WareController {
    @Autowired
    private WareService wareService;

    //查询所有仓库列表
//    url: `${api_name}/findAllList`,
//    method: 'get'
    @ApiOperation("查询所有仓库列表")
    @GetMapping("findAllList")
    public Result findAllList() {
        List<Ware> list = wareService.list();
        return Result.ok(list);
    }
}
