package com.spring.boot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.boot.dao.UserDataPoMapper;
import com.spring.boot.dao.model.UserDataPo;
import com.spring.boot.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * Service层
 *
 * @author 代码的路
 * @date 2022/6/8
 */

@Service
@EnableScheduling
public class MyServiceImpl extends ServiceImpl<UserDataPoMapper,UserDataPo> implements MyService {

    @Resource
    UserDataPoMapper userDataPoMapper;

    // 查
    @Override
    public List<UserDataPo> selectByPrimaryKey(int id) {
        LambdaQueryWrapper<UserDataPo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserDataPo::getId, id);
        List<UserDataPo> userDataPoList = userDataPoMapper.selectList(wrapper);

        return userDataPoList;
    }

}
