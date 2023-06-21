package com.ljw.mapper;

import com.ljw.pojo.c.Character;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;

/***
 *@title characterMapper
 *@auther ljw
 *@create 2023/6/9 21:38
 **/
@Mapper
public interface characterMapper {
    @Select("select * from `character` where name is not null and name!=''")
    ArrayList<Character> getAllCharacter();
    @Update("update character set value=#{value},country=#{country},recruitable=#{recruitable} where id=#{id}")
    void updateCharacter(Character character);
}
