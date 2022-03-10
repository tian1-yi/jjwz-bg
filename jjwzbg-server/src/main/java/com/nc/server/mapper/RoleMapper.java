package com.nc.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nc.server.pojo.Admin;
import com.nc.server.pojo.Role;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<Role> getRoles(Integer adminId);
}
