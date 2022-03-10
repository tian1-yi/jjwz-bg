package com.nc.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nc.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> getMenusByAdminId(Integer id);

    List<Menu> getMenusWithRole();

    List<Menu> getAllMenus();
}
