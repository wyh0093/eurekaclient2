package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: eurekaclient2
 * @description:
 * @author: Yunhuan Wang
 * @create: 2019-12-03 14:48
 **/
@FeignClient(value = "eureka-hello2")
@Service
public interface ClientService {
    @RequestMapping("/aaa")
    String aaa(@RequestParam(name = "name") String name);
}
