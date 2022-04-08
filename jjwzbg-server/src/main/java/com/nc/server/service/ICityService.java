package com.nc.server.service;

import com.nc.server.pojo.City;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 市表 服务类
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
public interface ICityService extends IService<City> {

    List<City> getCitysByProvinceId(String provinceId);


}
