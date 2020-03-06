package com.liqiao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {

    @RequestMapping("/quick")
    public String quickController() {
       return "hello springboot!!!";
    }
}
