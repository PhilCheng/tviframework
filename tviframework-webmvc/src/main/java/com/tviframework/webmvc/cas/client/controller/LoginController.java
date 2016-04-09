package com.tviframework.webmvc.cas.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Phil on 16/4/10.
 * 请在此处描述该类的作用
 */
@Controller
public class LoginController
{
    @RequestMapping(value = "/login")
    public String login()
    {
        return "login";
    }
}
