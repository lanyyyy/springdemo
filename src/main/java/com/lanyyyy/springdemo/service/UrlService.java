package com.lanyyyy.springdemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

//@PropertySource("classpath:application.properties")
@Service("UrlService")
public class UrlService {
    @Value("${baiduurl}")
    public String baiduurl;

    //    @RequestMapping(path="/getbaidu", method=RequestMethod.GET)
    public String getBaiduurl() {
        return "zhaolehaha";
    }
}