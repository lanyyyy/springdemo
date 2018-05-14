package com.lanyyyy.springdemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lanyyyy.springdemo.service.*;

import javax.annotation.Resource;

@RestController
public class GetURL {
    @Value("${baiduurl}")
    public String baiduurl;

    @Resource
    public UrlService urlservice;

    @RequestMapping(path="/getbaidu", method=RequestMethod.GET)
    public String getBaiduurl(){
        return urlservice.getBaiduurl();
//        return baiduurl;
    }

//    @RequestMapping(path="/getbaidu1", method=RequestMethod.GET)
//    public String getBaiduurl1(){
////        return "hello";
//        UrlService url = new UrlService();
//        return url.getBaiduurl();
//    }


}
