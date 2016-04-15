package com.tviframework.webmvc.cas.client.controller;

import org.jasig.cas.client.util.AssertionHolder;
import org.jasig.cas.client.validation.Assertion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * Created by Phil on 16/4/10.
 * 该类用于与CAS服务器端交互
 */
@Controller
public class LoginController
{
    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/")
    public String login( )
    {
        return "login";
    }

    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request)
    {
        //从服务端获取用户信息声明
        Assertion assertion = AssertionHolder.getAssertion();
        //获取登录ID
        String loginId = assertion.getPrincipal().getName();
        //获取其他用户信息
        Map userinfo = assertion.getPrincipal().getAttributes();
        //将登录ID加入到Map中
        userinfo.put("loginId", loginId);
        //将用户信息对象发送到页面
        request.setAttribute("userinfo", userinfo);logger.info("Login Name : " + userinfo.get("email"));
        return "index";
    }
}
