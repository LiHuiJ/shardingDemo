package com.lihuijun.demo.repository;

import com.lihuijun.demo.domain.UsAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsAdminRepository extends JpaRepository<UsAdmin, Integer> {
}
