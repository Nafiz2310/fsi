package com.fsi.jasperreport.fsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class menuView {

     @GetMapping("/")
    public String example(){
        return "user-list-regular";
    }
   /* @GetMapping("/")
    public String userProfileRegular(){
        return "/user-profile-regular";
    }*/
}
