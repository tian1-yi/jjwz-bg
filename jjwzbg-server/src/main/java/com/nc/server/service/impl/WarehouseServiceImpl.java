package com.nc.server.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nc.server.pojo.Province;
import com.nc.server.pojo.RespPageBean;
import com.nc.server.pojo.Warehouse;
import com.nc.server.mapper.WarehouseMapper;
import com.nc.server.service.IWarehouseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 仓库表 服务实现类
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
@Service
public class WarehouseServiceImpl extends ServiceImpl<WarehouseMapper, Warehouse> implements IWarehouseService {


    @Autowired
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Province> getAllWarehouse() {

        return warehouseMapper.getAllWarehouse();
    }

    @Override
    public List<Warehouse> getWarehouses() {
        return null;
    }

    @Override
    public RespPageBean getWarehouses(Integer currentPage, Integer size, Warehouse warehouse) {
        Page<Warehouse> page = new Page<>(currentPage, size);
        IPage<Warehouse> iPage = warehouseMapper.getWarehouse(page, warehouse);
        return new RespPageBean(iPage.getTotal(), iPage.getRecords());
    }


}
