package com.nc.server.service.impl;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nc.server.mapper.MeasureMapper;
import com.nc.server.pojo.BigType;
import com.nc.server.pojo.Measure;
import com.nc.server.pojo.RespPageBean;
import com.nc.server.service.IMeasureService;
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
public class MeasureServiceImpl extends ServiceImpl<MeasureMapper, Measure> implements IMeasureService {

    @Autowired
    private MeasureMapper measureMapper;

    @Override
    public RespPageBean getMeasures(Integer currentPage, Integer size) {
        Page<Measure> page = new Page<>(currentPage, size);
        Page<Measure> measurePage = page(page);
        return new RespPageBean(measurePage.getTotal(), measurePage.getRecords());
    }
}
