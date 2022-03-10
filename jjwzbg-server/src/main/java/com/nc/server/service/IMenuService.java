package com.nc.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nc.server.pojo.Menu;
import com.nc.server.pojo.Role;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 根据用户id获取菜单列表
     * @return
     */
    List<Menu> getMenusByAdminId();


    List<Menu> getMenusWithRole();

    List<Role> getRoles(Integer adminId);

    List<Menu> getAllMenus();


}
