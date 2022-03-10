package com.nc.server.controller;

import com.nc.server.pojo.Admin;
import com.nc.server.pojo.AdminLoginParam;
import com.nc.server.pojo.RespBean;
import com.nc.server.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Api(tags = "LoginController")
@RestController
public class LoginController {

    @Autowired
    private IAdminService iAdminService;


    @ApiOperation(value = "登陆之后返回token")
    @PostMapping("/login")
    public RespBean login(@RequestBody AdminLoginParam adminLoginParam, HttpServletRequest request) {
        return iAdminService.login(adminLoginParam.getUsername(), adminLoginParam.getPassword(), adminLoginParam.getCode(), request);
    }

    @ApiOperation(value = "获取当前登陆用户的信息！")
    @GetMapping("/admin/info")
    public Admin getAdminInfo(Principal principal) {
        if (null == principal) {
            return null;
        }
        String username = principal.getName();
        Admin admin = iAdminService.getAdminByUserName(username);
        admin.setPassword(null);
        admin.setRoles(iAdminService.getRoles(admin.getId()));
        return admin;
    }

    @ApiOperation(value = "退出登陆！")
    @PostMapping("/logout")
    public RespBean logout() {
        return RespBean.success("注销成功");
    }

}
