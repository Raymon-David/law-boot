package com.boot.controller;

import com.alibaba.fastjson.JSONObject;
import com.boot.service.LoginService;
import com.boot.service.UserService;
import com.boot.util.CommonUtil;
import com.boot.util.StringUtils;
import org.activiti.engine.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author: raymon
 * @description: 登录相关Controller
 * @date: 2017/10/24 10:33
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private IdentityService identityService;
    @Autowired
    private UserService userService;

    /**
     * 登录
     *
     * @param requestJson
     * @return
     */
    @RequestMapping("/login/auth")
    public JSONObject authLogin(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "username,password");
        System.out.println(loginService.authLogin(requestJson));
        return loginService.authLogin(requestJson);
    }

    /**
     * 查询当前登录用户的信息
     *
     * @return
     */
    @PostMapping("/getInfo")
    public JSONObject getInfo() {
        return loginService.getInfo();
    }

    /**
     * 登出
     *
     * @return
     */
    @PostMapping("/logout")
    public JSONObject logout() {
        return loginService.logout();
    }


    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String login() {
        return "pages/user/login";
    }

    @RequestMapping(value = "/index", method = {RequestMethod.GET})
    public String index() {
        return "pages/user/index";
    }

    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public String test() {
        System.out.println(userService.getAllRoles());
        return "pages/user/index";
    }
}
