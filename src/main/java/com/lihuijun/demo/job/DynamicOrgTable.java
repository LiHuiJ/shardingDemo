package com.lihuijun.demo.job;

import com.lihuijun.demo.common.DynamicTablesCache;
import com.lihuijun.demo.repository.TOrgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableScheduling
public class DynamicOrgTable {

    @Autowired
    private TOrgRepository orgRepository;

    //@Scheduled(cron = "* 0/1 * * * ?")
    public void createTables(){
        //更新缓存
        List<String> tables = orgRepository.getOrgTables();
        DynamicTablesCache.TableCache.TABLES = tables;
    }
}
