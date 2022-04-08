package com.nc.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nc.server.pojo.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 员工表 服务类
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
public interface IAdminService extends IService<Admin> {

    /**
     * 登陆之后返回token
     * @param username
     * @param password
     * @param code
     * @param request
     * @return
     */
    RespBean login(String username, String password, String code, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);

    /**
     * 根据用户id获取角色列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);


    List<Admin> getAllAdmins(String keywords);


    RespBean updateAdminRole(Integer adminId, Integer[] rids);


    Admin getAdminById(Integer id);



    List<AdminInfo> getAdminsByUserName(String name);
}
