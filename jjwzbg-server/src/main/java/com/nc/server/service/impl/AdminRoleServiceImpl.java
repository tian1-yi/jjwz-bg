package com.nc.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nc.server.mapper.AdminRoleMapper;
import com.nc.server.pojo.AdminRole;
import com.nc.server.service.IAdminRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员角色中间表 服务实现类
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements IAdminRoleService {

}
