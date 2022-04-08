package com.nc.server.mapper;

import com.nc.server.pojo.City;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 市表 Mapper 接口
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
public interface CityMapper extends BaseMapper<City> {

    List<City> getCitysByProvinceId(String provinceId);
}
