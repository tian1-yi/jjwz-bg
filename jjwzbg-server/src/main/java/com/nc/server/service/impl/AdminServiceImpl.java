package com.nc.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nc.server.config.security.JwtTokenUtil;
import com.nc.server.mapper.AdminMapper;
import com.nc.server.mapper.AdminRoleMapper;
import com.nc.server.mapper.RoleMapper;
import com.nc.server.pojo.*;
import com.nc.server.service.IAdminRoleService;
import com.nc.server.service.IAdminService;
import com.nc.server.utils.AdminUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 员工表 服务实现类
 * </p>
 *
 * @author lzc
 * @since 2022-02-28
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {


    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private AdminRoleMapper adminRoleMapper;

    @Override
    public RespBean login(String username, String password, String code, HttpServletRequest request) {

        String captcha = (String) request.getSession().getAttribute("captcha");
        if (StringUtils.isEmpty(code) || !captcha.equals(code)) {
            return RespBean.error("验证码输入错误！");
        }

        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if (null==userDetails || !passwordEncoder.matches(password, userDetails.getPassword())) {
            return RespBean.error("用户名或密码不正确！");
        }
        if (!userDetails.isEnabled()) {
            return RespBean.error("账号被禁用！");
        }

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        //生成token
        String token = jwtTokenUtil.generateToken(userDetails);
        HashMap<String, String> map = new HashMap<>();
        map.put("token", token);
        map.put("tokenHead", tokenHead);
        return RespBean.success("登陆成功！", map);
    }

    @Override
    public Admin getAdminByUserName(String username) {

        return adminMapper.selectOne(new QueryWrapper<Admin>().eq("username", username).eq("enabled", true));
    }

    @Override
    public List<Role> getRoles(Integer adminId) {
        return roleMapper.getRoles(adminId);
    }

    @Override
    public List<Admin> getAllAdmins(String keywords) {
        return adminMapper.getAllAdmins(AdminUtils.getCurrentAdmin().getId(), keywords);
    }

    @Override
    public RespBean updateAdminRole(Integer adminId, Integer[] rids) {
        adminRoleMapper.delete(new QueryWrapper<AdminRole>().eq("admin_id", adminId));
        Integer result = adminRoleMapper.updateAdminRole(adminId, rids);
        if (rids.length == result) {
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }

    @Override
    public Admin getAdminById(Integer id) {
        System.out.println(adminMapper.getAdminById(id));
        return adminMapper.getAdminById(id);
    }

}
