package com.lihuijun.demo.controller;

import com.lihuijun.demo.common.LeeResult;
import com.lihuijun.demo.repository.UsAdminRepository;
import com.lihuijun.demo.domain.UsAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class ApacheTestController {

    @Autowired
    private UsAdminRepository UsAdminRepository;

    @GetMapping("/add")
    public LeeResult<String> add(){
        for (int i = 0; i < 10; i++){
            UsAdmin us = new UsAdmin();
            us.setId(i+1);
            us.setAddrId(i);
            us.setUserId(i);
            us.setUserName("name_" + i);
            UsAdminRepository.save(us);
        }
        return LeeResult.success("ok");
    }

    @GetMapping("/list")
    public LeeResult<List<UsAdmin>> getList(){
        return LeeResult.success("ok",UsAdminRepository.findAll());
    }
}
