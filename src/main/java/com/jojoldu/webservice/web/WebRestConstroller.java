package com.jojoldu.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestConstroller {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }


    //버그수정로직이 추가됨
}
