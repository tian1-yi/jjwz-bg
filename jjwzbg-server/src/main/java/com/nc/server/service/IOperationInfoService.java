package com.nc.server.service;

import com.nc.server.pojo.OperationInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nc.server.pojo.RespPageBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzc
 * @since 2022-04-09
 */
public interface IOperationInfoService extends IService<OperationInfo> {

    RespPageBean getAllOperationInfoByPage(Integer currentPage, Integer size, Integer serveType, Integer statusType);

    RespPageBean getAllWaitForVeritfy(Integer currentPage, Integer size);
}
