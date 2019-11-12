package com.cruddemo.springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String getInfo(){
        return "HELLO  WORLD！！！！";
    }

}
