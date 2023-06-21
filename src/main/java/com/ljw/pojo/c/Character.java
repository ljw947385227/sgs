package com.ljw.pojo.c;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 *@title general
 *@auther ljw
 *@create 2023/6/9 11:13
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character {
    int id;
    int value;
    int recruitable;
    int country;
    String name;
}
