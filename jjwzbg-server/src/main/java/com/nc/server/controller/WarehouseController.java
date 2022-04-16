package com.nc.server.controller;


import com.nc.server.pojo.*;
import com.nc.server.service.*;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 仓库表 前端控制器
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
@RestController
public class WarehouseController {

    @Autowired
    private IProvinceService provinceService;

    @Autowired
    private IWarehouseService warehouseService;

    @Autowired
    private IAdminService adminService;

    @Autowired
    private IManageWarehouseAdminService manageWarehouseAdminService;

    @Autowired
    private IWarehouseAdminService warehouseAdminService;

    @ApiModelProperty(value = "获取所有仓库列表")
    @GetMapping("/system/admin/allWarehouses")
    public List<Province> getAllWarehouse() {

        return provinceService.getAllWarehouse();
    }

    @ApiModelProperty(value = "获取所有仓库信息")
    @GetMapping("/warehouse/basic")
    public RespPageBean getWarehouses(@RequestParam(defaultValue = "1") Integer currentPage,
                                      @RequestParam(defaultValue = "10") Integer size,
                                      Warehouse warehouse) {
        return warehouseService.getWarehouses(currentPage, size, warehouse);
    }

    @ApiOperation(value = "获取操作员名字")
    @GetMapping("/adminName")
    public List<AdminInfo> getAdminName(@RequestParam(defaultValue = "") String name) {
        return adminService.getAdminsByUserName(name);

    }

    @ApiOperation(value = "添加仓库")
    @PostMapping("/warehouse/add")
    public RespBean addWarehouse(@RequestBody Warehouse warehouse) {
        warehouseService.save(warehouse);
//        warehouseAdminService.save(new WarehouseAdmin().setWarehouseId(warehouse.getId()).setAdminId(Integer.parseInt(warehouse.getAdminId())));
        manageWarehouseAdminService.save(new ManageWarehouseAdmin().setWarehouseId(warehouse.getId()).setAdminId(Integer.parseInt(warehouse.getAdminId())));
        System.out.println(warehouse);
        return RespBean.success("添加成功");
    }

    @GetMapping("/warehouse/get")
    public Warehouse getWarehouse() {
        return warehouseService.getWarehouse();
    }


}
