package com.applet.giant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangdg
 * @Description:
 * @date 2017/12/23 16:54
 */
@RestController
@RequestMapping(value = "/applet")
public class IndexController {

    @GetMapping(value = "/index")
    public String getIndex(){
        return "success";
    }
}
