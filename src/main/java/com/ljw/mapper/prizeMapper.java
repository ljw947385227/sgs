package com.ljw.mapper;

import com.ljw.pojo.p.SinglePrize;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;

/***
 *@title prizeMapper
 *@auther ljw
 *@create 2023/6/1 4:52
 **/
@Mapper
public interface prizeMapper {
    @Insert("insert into prize(name,value,number) values(#{name},#{value},#{number})")
    int addSinglePrize(SinglePrize prize);
    @Select("select * from prize where id=#{id}")
    ArrayList<SinglePrize> getPById(int id);
    @Select("select * from prize")
    ArrayList<SinglePrize> getAllSP();
    @Update("update prize set name=#{name},value=#{value},number=#{number} where id=#{id}")
    int updateSP(SinglePrize singlePrize);
}
