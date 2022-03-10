package com.nc.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nc.server.pojo.AdminRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 管理员角色中间表 Mapper 接口
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    Integer updateAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);

}
