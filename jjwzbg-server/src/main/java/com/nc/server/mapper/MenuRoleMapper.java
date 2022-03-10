package com.nc.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nc.server.pojo.MenuRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 菜单角色中间表 Mapper 接口
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);

}
