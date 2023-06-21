package com.ljw.pojo.p;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 *@title skill
 *@auther ljw
 *@create 2023/6/9 11:14
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    int id;
    int type;
    String des;
}
