package com.lihuijun.demo.controller;

import com.lihuijun.demo.common.LeeResult;
import com.lihuijun.demo.domain.TOrg;
import com.lihuijun.demo.repository.TOrgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/dang")
public class DangDangTestController {

    @Autowired
    private TOrgRepository orgRepository;

    @GetMapping("/add")
    public LeeResult<String> add(){
        for (int i = 1; i < 11; i++){
            TOrg org = new TOrg();
            org.setId(i);
            org.setOrgCode(String.valueOf(i));
            org.setOrgName("name_" + i);
            org.setCreateTime(new Date());
            orgRepository.save(org);
        }
        return LeeResult.success("OK");
    }

    @GetMapping("/tables")
    public LeeResult tables(){
        return LeeResult.success(orgRepository.getOrgTables());
    }
}
