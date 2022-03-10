package com.nc.server.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.nc.server.pojo.*;
import com.nc.server.service.IAdminRoleService;
import com.nc.server.service.IAdminService;
import com.nc.server.service.IRoleService;
import com.nc.server.service.IWarehouseAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 员工表 前端控制器
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
@RestController
@RequestMapping("/system/admin")
public class AdminController {

    @Autowired
    private IAdminService adminService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IWarehouseAdminService warehouseAdminService;

    @Autowired
    private IAdminRoleService adminRoleService;

    @ApiOperation(value = "获取所有操作员！")
    @GetMapping("/")
    public List<Admin> getAllAdmind(String keywords) {
        return adminService.getAllAdmins(keywords);
    }

    @ApiOperation(value = "根据id获取操作员信息！")
    @GetMapping("/getid/{id}")
    public Admin getAdminById(@PathVariable Integer id) {

        return adminService.getAdminById(id);
    }

    @ApiOperation(value = "添加操作员！")
    @PostMapping("/add")
    public RespBean addAdmin(@RequestBody Admin admin) {

        if (adminService.save(admin) && warehouseAdminService.save(new WarehouseAdmin().setAdminId(admin.getId()).setWarehouseId(admin.getWarehouseId()))) {
            int size = admin.getRoleIds().size();
            Integer[] roleIds = new Integer[size];
            for (int i = 0; i < size; i ++) {
                roleIds[i] = admin.getRoleIds().get(i);
            }
            if ((admin.getRoleIds().size() == 0) || (adminService.updateAdminRole(admin.getId(), roleIds).getCode()) == 200) {
                return RespBean.success("添加成功！");
            }
        }
        return RespBean.error("添加失败！");
//        return RespBean.success("添加成功");
    }

    @ApiOperation(value = "更新操作员！")
    @PutMapping("/")
    public RespBean updateAdmin(@RequestBody Admin admin) {
        if (adminService.updateById(admin)) {
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }

    @ApiOperation(value = "删除操作员！")
    @DeleteMapping("/{id}")
    public RespBean deleteAdmin(@PathVariable Integer id) {
        adminService.removeById(id);
        adminRoleService.remove(new QueryWrapper<AdminRole>().eq("admin_id", id));
        warehouseAdminService.remove(new QueryWrapper<WarehouseAdmin>().eq("admin_id", id));
        return RespBean.success("更新成功！");
    }

    @ApiOperation(value = "更新操作员！")
    @PostMapping("/update")
    public RespBean updateAdminInfo(@RequestBody Admin admin) {
        System.out.println("updateAdminInfo: " + admin);
        adminService.updateById(admin);
        int size = admin.getRoleIds().size();
        Integer[] roleIds = new Integer[size];
        for (int i = 0; i < size; i ++) {
            roleIds[i] = admin.getRoleIds().get(i);
        }
        adminService.updateAdminRole(admin.getId(), roleIds);
        warehouseAdminService.update(new WarehouseAdmin().setAdminId(admin.getId()).setWarehouseId(admin.getWarehouseId()), new UpdateWrapper<WarehouseAdmin>().eq("admin_id", admin.getId()));
        return RespBean.success("更新成功！");
    }

    @ApiOperation(value = "获取所有角色！")
    @GetMapping("/roles")
    public List<Role> getAllRoles() {
        return roleService.list();
    }

    @ApiOperation(value = "更新操作员角色")
    @PutMapping("/role")
    public RespBean updateAdminRole(Integer adminId, Integer[] rids) {
        return adminService.updateAdminRole(adminId, rids);
    }
}
