package com.nc.server.service;

import com.nc.server.pojo.Material;
import com.nc.server.pojo.WarehouseMaterial;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzc
 * @since 2022-04-09
 */
public interface IWarehouseMaterialService extends IService<WarehouseMaterial> {

    List<Material> getByWarehouse(Long smallId);
}
