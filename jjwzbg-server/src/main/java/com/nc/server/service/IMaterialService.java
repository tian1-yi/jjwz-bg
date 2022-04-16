package com.nc.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.nc.server.pojo.Material;
import com.nc.server.pojo.RespPageBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzc
 * @since 2022-04-08
 */
public interface IMaterialService extends IService<Material> {

    RespPageBean getWarehouses(Integer currentPage, Integer size, Material material);
}
