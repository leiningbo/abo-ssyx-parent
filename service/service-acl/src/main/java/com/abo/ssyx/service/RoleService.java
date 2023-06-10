package com.abo.ssyx.service;

import com.abo.ssyx.model.acl.Role;
import com.abo.ssyx.vo.acl.RoleQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * @author lnb
 * @date 2023/6/9 14:22
 */
public interface RoleService extends IService<Role> {

    //角色分页列表
    IPage<Role> selectPage(Page<Role> pageParam, RoleQueryVo roleQueryVo);

    //获取所有角色，和根据用户id查询用户分配角色列表
    Map<String, Object> getRoleByAdminId(Long adminId);

    //为用户进行分配
    void saveAdminRole(Long adminId, Long[] roleIds);
}
