package com.nc.server.service.impl;

import com.nc.server.pojo.Status;
import com.nc.server.mapper.StatusMapper;
import com.nc.server.service.IStatusService;
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
public class StatusServiceImpl extends ServiceImpl<StatusMapper, Status> implements IStatusService {

}
