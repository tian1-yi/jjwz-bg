package com.nc.server.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nc.server.mapper.MaterialMapper;
import com.nc.server.pojo.Material;
import com.nc.server.pojo.RespPageBean;
import com.nc.server.pojo.Warehouse;
import com.nc.server.service.IMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzc
 * @since 2022-04-08
 */
@Service
public class MaterialServiceImpl extends ServiceImpl<MaterialMapper, Material> implements IMaterialService {

    @Autowired
    private MaterialMapper materialMapper;


    @Override
    public RespPageBean getWarehouses(Integer currentPage, Integer size, Material material) {
        Page<Material> page = new Page<>(currentPage, size);
        IPage<Material> iPage = materialMapper.getWarehouse(page, material);
        return new RespPageBean(iPage.getTotal(), iPage.getRecords());
    }
}
