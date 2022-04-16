package com.nc.server.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nc.server.pojo.Material;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzc
 * @since 2022-04-08
 */
public interface MaterialMapper extends BaseMapper<Material> {

    IPage<Material> getWarehouse(Page<Material> page, Material material);
}
