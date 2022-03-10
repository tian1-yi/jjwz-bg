package com.nc.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nc.server.mapper.MenuRoleMapper;
import com.nc.server.pojo.MenuRole;
import com.nc.server.pojo.RespBean;
import com.nc.server.service.IMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 菜单角色中间表 服务实现类
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    @Override
    @Transactional
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid", rid));
        if (null == mids || 0 == mids.length) {
            return RespBean.success("更新成功！");
        }
        Integer integer = menuRoleMapper.insertRecord(rid, mids);
        if (integer == mids.length) {
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
