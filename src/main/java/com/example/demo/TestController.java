package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: eurekaclient2
 * @description:
 * @author: Yunhuan Wang
 * @create: 2019/12/3 14:52
 **/
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ClientService clientService;
    @RequestMapping("/aaa")
    public String aaa(String name){
//        return clientService.aaa(name);
        String aa = clientService.aaa(name);
        System.out.println("---"+aa);
        return aa;
    }
    @RequestMapping("/testaa")
    public String testaa(@RequestParam(name = "name") String name){
        //HELLOW-WORLD是注册中心的消息注册,test为服务注册中的test方法
        String body = restTemplate.getForEntity("",String.class).getBody();
        return body;
    }
}
