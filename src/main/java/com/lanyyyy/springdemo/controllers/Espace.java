package com.lanyyyy.springdemo.controllers;

import com.lanyyyy.springdemo.service.UrlService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import javax.annotation.Resource;

@RestController
public class Espace {

    @RequestMapping(path="/users", method=RequestMethod.GET)
    public String getBaiduurl(){
        JSONObject obj = new JSONObject();
        obj.put("id", "z00123456");
        obj.put("name", "gouqing");
        obj.put("auth", "no");
        return obj.toString();

    }
}
