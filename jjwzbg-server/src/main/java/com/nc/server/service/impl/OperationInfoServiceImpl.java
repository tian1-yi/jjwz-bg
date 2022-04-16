package com.nc.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nc.server.pojo.*;
import com.nc.server.mapper.OperationInfoMapper;
import com.nc.server.service.IAdminService;
import com.nc.server.service.IOperationInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nc.server.service.IWarehouseAdminService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzc
 * @since 2022-04-09
 */
@Service
public class OperationInfoServiceImpl extends ServiceImpl<OperationInfoMapper, OperationInfo> implements IOperationInfoService {

    @Autowired
    private OperationInfoMapper operationInfoMapper;

    @Autowired
    private IAdminService adminService;

    @Autowired
    private IWarehouseAdminService warehouseAdminService;

    @Override
    public RespPageBean getAllOperationInfoByPage(Integer currentPage, Integer size, Integer serveType, Integer statusType) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Admin admin = adminService.getAdminByUserName(authentication.getName());
        Page<OperationInfo> page = new Page<>(currentPage, size);

        Page<OperationInfo>    pageinfo = operationInfoMapper.getAllOperationInfoByPage(page, admin.getId(), serveType, statusType);


        System.out.println(pageinfo.getRecords());
        return new RespPageBean(pageinfo.getTotal(), pageinfo.getRecords());
    }

    @Override
    public RespPageBean getAllWaitForVeritfy(Integer currentPage, Integer size) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Admin admin = adminService.getAdminByUserName(authentication.getName());
        WarehouseAdmin admin_id = warehouseAdminService.getOne(new QueryWrapper<WarehouseAdmin>().eq("admin_id", admin.getId()));
        Page<OperationInfo> page = new Page<>(currentPage, size);
        Page<OperationInfo> pageInfo = operationInfoMapper.getAllWaitForVeritfy(page, admin_id.getWarehouseId());
        return new RespPageBean(pageInfo.getTotal(), pageInfo.getRecords());
    }
}
