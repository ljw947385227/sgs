package com.ljw.service;

import com.ljw.mapper.prizeMapper;
import com.ljw.pojo.p.SinglePrize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/***
 *@title prizeServiceImpl
 *@auther ljw
 *@create 2023/6/8 19:37
 **/
@Service
public class prizeServiceImpl {
    @Autowired
    prizeMapper prizeMapper;
    public ArrayList<SinglePrize> getPById(int id){
        return prizeMapper.getPById(id);
    }

    public ArrayList<SinglePrize> getAllSP(){
        return prizeMapper.getAllSP();
    }
    public int addSinglePrize(SinglePrize singlePrize){
        return prizeMapper.addSinglePrize(singlePrize);
    }
    public int updateSP(SinglePrize singlePrize){
        return prizeMapper.updateSP(singlePrize);
    }


}
