package com.nc.server.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.nc.server.pojo.Province;
import com.nc.server.pojo.RespPageBean;
import com.nc.server.pojo.Warehouse;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 仓库表 服务类
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
public interface IWarehouseService extends IService<Warehouse> {

    List<Province> getAllWarehouse();


    List<Warehouse> getWarehouses();


    RespPageBean getWarehouses(Integer currentPage, Integer size, Warehouse warehouse);


    Warehouse getWarehouse();
}
