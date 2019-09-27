package com.bat.mengfan.redis_demo.controller;

import com.bat.mengfan.redis_demo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping(value = "/key/get",method = RequestMethod.GET)
    public String getKey(String key){
        System.out.println(redisUtil.get(key));
        return "getOk";
    }
    @RequestMapping(value = "/key/set",method = RequestMethod.GET)
    public String setKey(String key,String value){
        System.out.println(redisUtil.set(key,value));
        return "setOk";
    }
}
