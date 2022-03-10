package com.nc.server.service.impl;

import com.nc.server.pojo.County;
import com.nc.server.mapper.CountyMapper;
import com.nc.server.service.ICountyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 县表 服务实现类
 * </p>
 *
 * @author lzc
 * @since 2022-03-06
 */
@Service
public class CountyServiceImpl extends ServiceImpl<CountyMapper, County> implements ICountyService {

}
