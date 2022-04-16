package com.nc.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nc.server.pojo.Admin;
import com.nc.server.pojo.Material;
import com.nc.server.pojo.WarehouseAdmin;
import com.nc.server.pojo.WarehouseMaterial;
import com.nc.server.mapper.WarehouseMaterialMapper;
import com.nc.server.service.IAdminService;
import com.nc.server.service.IWarehouseAdminService;
import com.nc.server.service.IWarehouseMaterialService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzc
 * @since 2022-04-09
 */
@Service
public class WarehouseMaterialServiceImpl extends ServiceImpl<WarehouseMaterialMapper, WarehouseMaterial> implements IWarehouseMaterialService {

    @Autowired
    private IAdminService adminService;

    @Autowired
    private IWarehouseAdminService warehouseAdminService;

    @Autowired
    private WarehouseMaterialMapper warehouseMaterialMapper;

    @Override
    public List<Material> getByWarehouse(Long smallId) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Admin admin = adminService.getAdminByUserName(authentication.getName());
        WarehouseAdmin warehouseAdmin = warehouseAdminService.getOne(new QueryWrapper<WarehouseAdmin>().eq("admin_id", admin.getId()));
        List<Material> result = warehouseMaterialMapper.getByWarehouse(smallId, warehouseAdmin.getWarehouseId());
        return result;
    }
}
