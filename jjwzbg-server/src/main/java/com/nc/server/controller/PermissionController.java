package com.nc.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nc.server.pojo.Menu;
import com.nc.server.pojo.MenuRole;
import com.nc.server.pojo.RespBean;
import com.nc.server.pojo.Role;
import com.nc.server.service.IMenuRoleService;
import com.nc.server.service.IMenuService;
import com.nc.server.service.IRoleService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/system/basic/permission")
public class PermissionController {


    @Autowired
    private IRoleService roleService;

    @Autowired
    private IMenuService menuService;

    @Autowired
    private IMenuRoleService menuRoleService;


    @ApiModelProperty(value = "获取所有角色")
    @GetMapping("/")
    public List<Role> getAllRoles() {
        return roleService.list();
    }

    @ApiModelProperty(value = "添加角色")
    @PostMapping("/role")
    public RespBean addRole(@RequestBody Role role) {
        if (!role.getName().startsWith("ROLE_")) {
            role.setName("ROLE_" + role.getName());
        }
        if (roleService.save(role)) {
            return RespBean.success("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @ApiModelProperty(value = "删除角色！")
    @DeleteMapping("/role/{rid}")
    public RespBean deleteRole(@PathVariable Integer rid) {
        if (roleService.removeById(rid)) {
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败");
    }


    @ApiModelProperty(value = "查询所有菜单")
    @GetMapping("/menus")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @ApiModelProperty(value = "根据角色id查看菜单")
    @GetMapping("/mid/{rid}")
    public List<Integer> getMidByRid(@PathVariable Integer rid) {
        return menuRoleService.list(new QueryWrapper<MenuRole>().eq("rid", rid)).stream().map(MenuRole::getMid).collect(Collectors.toList());
    }

    @ApiModelProperty(value = "更新角色菜单")
    @PutMapping("/")
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        return menuRoleService.updateMenuRole(rid, mids);
    }
}
