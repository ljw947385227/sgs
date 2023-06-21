package com.ljw.pojo.p;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 *@title prize
 *@auther ljw
 *@create 2023/6/1 4:49
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SinglePrize {
    int id;
    int number;
    String name;
    int value;
}
