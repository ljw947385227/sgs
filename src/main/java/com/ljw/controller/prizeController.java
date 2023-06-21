package com.ljw.controller;

import com.ljw.pojo.p.SinglePrize;
import com.ljw.service.prizeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/***
 *@title prizeController
 *@auther ljw
 *@create 2023/6/8 19:39
 **/
@RestController
@CrossOrigin
@Controller
public class prizeController {
    @Autowired
    prizeServiceImpl prizeService;

    @RequestMapping("/getPById")
    ArrayList<SinglePrize> getPById(int id){
        return prizeService.getPById(id);
    }
    @RequestMapping("/getAllSP")
    ArrayList<SinglePrize> getAllSP(){
        return prizeService.getAllSP();
    }
    @RequestMapping("/addSP")
    boolean addSP(SinglePrize singlePrize){
        return prizeService.addSinglePrize(singlePrize)>1;
    }
    @RequestMapping("/updateSP")
    boolean updateSP(SinglePrize singlePrize){
        return prizeService.updateSP(singlePrize)>0;
    }

}
