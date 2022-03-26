package com.nc.server.controller;


import com.nc.server.pojo.Province;
import com.nc.server.pojo.Warehouse;
import com.nc.server.service.IProvinceService;
import com.nc.server.service.IWarehouseService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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

    @ApiModelProperty(value = "获取所有仓库列表")
    @GetMapping("/system/admin/allWarehouses")
    public List<Province> getAllWarehouse() {

        return provinceService.getAllWarehouse();
    }

    @ApiModelProperty(value = "获取所有仓库信息")
    @GetMapping("/warehouse/basic")
    public List<Warehouse> getWarehouses() {
        return warehouseService.getWarehouses();
    }
}
