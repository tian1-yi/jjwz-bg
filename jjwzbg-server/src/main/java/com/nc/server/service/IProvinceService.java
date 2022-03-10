package com.nc.server.service;

import com.nc.server.pojo.Province;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 省份表 服务类
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
public interface IProvinceService extends IService<Province> {

    List<Province> getAllWarehouse();


}
