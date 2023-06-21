package com.ljw;

import com.ljw.mapper.prizeMapper;
import com.ljw.pojo.p.SinglePrize;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/***
 *@title AddTest
 *@auther ljw
 *@create 2023/6/1 4:55
 **/
@SpringBootTest
public class CRUDTest {
    @Autowired
    prizeMapper mapper;
    @Test
    void addSinglePrize(){
        String name[]={"史诗体验卡","欢乐豆","菜篮子","换将卡","手气卡","点将卡","进阶丹","雁翎甲","招募令","史诗宝珠碎片","菜篮子","妧慧","史诗宝珠","将魂","雪中舞韧*张春华","花蔓","傅俭","史诗宝珠","神荀彧"};
        int value[]= {1000,1000,1360,5000,5000,3000,1000,1000,1000,200,200,100,100,15,10,10,3,1,1};
        int number[]= {1,50,2,2,2,2,2,1,1,1,99,1,1,1000,1,1,1,66,1};
        for(int i=0;i<name.length;i++){
            SinglePrize prize=new SinglePrize();
            prize.setId(1);
            prize.setName(name[i]);
            prize.setNumber(number[i]);
            prize.setValue(value[i]);
            mapper.addSinglePrize(prize);
        }
    }

}
