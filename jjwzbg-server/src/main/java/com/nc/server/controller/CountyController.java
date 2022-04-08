package com.nc.server.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nc.server.pojo.County;
import com.nc.server.service.ICountyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 县表 前端控制器
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
@RestController
@RequestMapping("/county")
public class CountyController {

    @Autowired
    private ICountyService countyService;

    @GetMapping("/countys")
    public List<County> getCounty(@RequestParam String cityId) {
        return countyService.list(new QueryWrapper<County>().eq("city_id", cityId));
    }
}
