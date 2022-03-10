package com.nc.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nc.server.mapper.MenuMapper;
import com.nc.server.pojo.Admin;
import com.nc.server.pojo.Menu;
import com.nc.server.pojo.Role;
import com.nc.server.service.IMenuService;
import com.nc.server.utils.AdminUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenusByAdminId() {
        System.out.println(AdminUtils.getCurrentAdmin().getId());
        return menuMapper.getMenusByAdminId(((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    @Override
    public List<Menu> getMenusWithRole() {
        return menuMapper.getMenusWithRole();
    }

    @Override
    public List<Role> getRoles(Integer adminId) {
        return null;
    }

    @Override
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }
}
