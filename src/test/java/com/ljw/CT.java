package com.ljw;

import com.ljw.mapper.characterMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/***
 *@title CT
 *@auther ljw
 *@create 2023/6/9 22:14
 **/
@SpringBootTest
public class CT {
    @Autowired
    com.ljw.mapper.characterMapper characterMapper;
    @Test
    void test(){
        System.out.println(characterMapper.getAllCharacter());
    }
}
