package com.nc.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nc.server.pojo.Admin;
import com.nc.server.pojo.AdminInfo;
import com.nc.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 * 员工表 Mapper 接口
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
public interface AdminMapper extends BaseMapper<Admin> {


    List<Admin> getAllAdmins(Integer id, String keywords);

    Admin getAdminById(Integer id);

    List<AdminInfo> getAdminsByName(String name);
}
