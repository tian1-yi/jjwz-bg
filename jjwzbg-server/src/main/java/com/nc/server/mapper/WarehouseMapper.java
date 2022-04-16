package com.nc.server.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nc.server.pojo.Province;
import com.nc.server.pojo.Warehouse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 仓库表 Mapper 接口
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
public interface WarehouseMapper extends BaseMapper<Warehouse> {

    List<Province> getAllWarehouse();

    IPage<Warehouse> getWarehouse(Page<Warehouse> page, @Param("warehouse")Warehouse warehouse);

    Warehouse getWarehouseById(@Param("id") Integer id);
}
