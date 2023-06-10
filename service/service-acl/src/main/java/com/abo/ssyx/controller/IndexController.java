package com.abo.ssyx.controller;

import com.abo.ssyx.common.result.Result;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lnb
 * @date 2023/6/9 13:42
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/admin/acl/index")
public class IndexController {

    /**
     * 1、请求登陆的login
     */
    @PostMapping("login")
    public Result login() {
        Map<String,Object> map = new HashMap<>();
        map.put("token","admin-token");
        return Result.ok(map);
    }

    /**
     * 2 获取用户信息
     */
    @GetMapping("info")
    public Result info(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","abo666");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }

    /**
     * 3 退出
     */
    @PostMapping("logout")
    public Result logout(){
        return Result.ok(null);
    }


}
