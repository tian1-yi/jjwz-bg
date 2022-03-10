package com.nc.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nc.server.pojo.Menu;
import com.nc.server.pojo.MenuRole;
import com.nc.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 * 菜单角色中间表 服务类
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
public interface IMenuRoleService extends IService<MenuRole> {


    RespBean updateMenuRole(Integer rid, Integer[] mids);

}
