package com.nc.server.mapper;

import com.nc.server.pojo.Province;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 省份表 Mapper 接口
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
public interface ProvinceMapper extends BaseMapper<Province> {

    List<Province> getAllWarehouse();
}
