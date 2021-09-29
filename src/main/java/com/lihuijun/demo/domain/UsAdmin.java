package com.lihuijun.demo.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "us_admin")
public class UsAdmin {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "addr_id")
    private int addrId;

    @Column(name = "user_name")
    private String userName;

}
