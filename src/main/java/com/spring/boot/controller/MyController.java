package com.spring.boot.controller;

import com.spring.boot.dao.model.UserDataPo;
import com.spring.boot.service.impl.MyServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * Controller层
 *
 * @author 代码的路
 * @date 2022/6/8
 */


@RestController
@RequestMapping("/homepage")
public class MyController {

    @Resource
    MyServiceImpl myServiceImpl;

    @GetMapping("/selectByPrimaryKey")
    public List<UserDataPo> selectByPrimaryKey(@RequestParam("id") int id) {
        return myServiceImpl.selectByPrimaryKey(id);
    }

}
