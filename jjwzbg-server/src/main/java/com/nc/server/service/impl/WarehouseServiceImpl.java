package com.nc.server.service.impl;

import com.nc.server.pojo.Province;
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
}
