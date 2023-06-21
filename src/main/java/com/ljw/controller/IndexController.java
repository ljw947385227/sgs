package com.ljw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *@title IndexController
 *@auther ljw
 *@create 2023/6/8 19:31
 **/
@Controller
@CrossOrigin
@RestController
public class IndexController {
    @RequestMapping("/helloWorld")
    String helloWorld(){
        return "HelloWorld";
    }
}
