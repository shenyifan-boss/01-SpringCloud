package com.bjpowernode.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 奕凡
 * <p>
 * <p>
 * 2021/1/26
 **/
@RestController
public class ProviderController {

    @RequestMapping("/test")
    public String test(){

        return "第一个springcloud的服务提供者";
    }
}
