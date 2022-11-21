package com.Account.Account_service.controller;

import com.Account.Account_service.model.Bank_Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Bankcontroller {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        int a=5;
        int b=5;
        int c=8;
        return "this is jsut ms ff"+(a+b+c);
    }



}
