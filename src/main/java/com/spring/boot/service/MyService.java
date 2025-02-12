package com.spring.boot.service;

import com.spring.boot.dao.model.UserDataPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: 代码的路
 * @Date: 2025/2/10 17:27
 * @Param:
 * @Return:
 * @Description:
 **/

@Mapper
public interface MyService {

    List<UserDataPo> selectByPrimaryKey(int id);

}
