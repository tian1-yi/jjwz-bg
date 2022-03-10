package com.nc.server.controller;


import com.nc.server.pojo.Menu;
import com.nc.server.service.IAdminService;
import com.nc.server.service.IMenuRoleService;
import com.nc.server.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
@RestController
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @ApiOperation(value = "通过用户id查询菜单列表")
    @GetMapping("/system/menu")
    public List<Menu> getMenuByAdminId() {
        return menuService.getMenusByAdminId();
    }

}
