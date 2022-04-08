package com.nc.server.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nc.server.pojo.Province;
import com.nc.server.service.IProvinceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 省份表 前端控制器
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
@RestController
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    private IProvinceService provinceService;

    @ApiOperation(value = "获取所有省份")
    @GetMapping("/provinces")
    public List<Province> provinces() {
        return provinceService.list();
    }

}
