package com.nc.server.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nc.server.pojo.City;
import com.nc.server.service.ICityService;
import com.nc.server.service.IProvinceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 市表 前端控制器
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private ICityService cityService;

    @ApiOperation(value = "获取所有市通过省份")
    @GetMapping("/citys/")
    public List<City> getCitys(@RequestParam String provinceId) {
        return cityService.list(new QueryWrapper<City>().eq("province_id", provinceId));
    }

}
