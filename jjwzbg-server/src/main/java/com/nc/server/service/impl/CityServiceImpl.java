package com.nc.server.service.impl;

import com.nc.server.pojo.City;
import com.nc.server.mapper.CityMapper;
import com.nc.server.service.ICityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 市表 服务实现类
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

}
