package com.abo.ssyx.service.impl;


import com.abo.ssyx.mapper.AdminRoleMapper;
import com.abo.ssyx.model.acl.AdminRole;
import com.abo.ssyx.service.AdminRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements AdminRoleService {
}
