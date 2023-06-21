package com.ljw.controller;

import com.ljw.mapper.characterMapper;
import com.ljw.pojo.c.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/***
 *@title characterController
 *@auther ljw
 *@create 2023/6/9 21:42
 **/
@Controller
@CrossOrigin
@RestController
public class characterController {
    @Autowired
    characterMapper characterMapper;
    @RequestMapping("/getAllC")
    ArrayList<Character> getAll(){
        return characterMapper.getAllCharacter();
    }
}
