package com.nc.server.service.impl;

import com.nc.server.pojo.ServiceType;
import com.nc.server.mapper.ServiceTypeMapper;
import com.nc.server.service.IServiceTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class ServiceTypeServiceImpl extends ServiceImpl<ServiceTypeMapper, ServiceType> implements IServiceTypeService {

}
