package com.lihuijun.demo.repository;

import com.lihuijun.demo.domain.TOrg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TOrgRepository extends JpaRepository<TOrg, Integer> {

    @Query(value = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES " +
            "WHERE table_schema = 'demo_0' AND table_name LIKE 't_org_%'", nativeQuery = true)
    List<String> getOrgTables();
}
