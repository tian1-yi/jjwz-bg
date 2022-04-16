package com.nc.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.nc.server.pojo.Measure;
import com.nc.server.pojo.RespPageBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzc
 * @since 2022-04-08
 */
public interface IMeasureService extends IService<Measure> {

    RespPageBean getMeasures(Integer currentPage, Integer size);
}
