package com.nc.server.service.impl;

import com.nc.server.pojo.Province;
import com.nc.server.mapper.ProvinceMapper;
import com.nc.server.service.IProvinceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 省份表 服务实现类
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
@Service
public class ProvinceServiceImpl extends ServiceImpl<ProvinceMapper, Province> implements IProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<Province> getAllWarehouse() {
        return provinceMapper.getAllWarehouse();
    }
}
