package com.lihuijun.demo.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "t_org")
public class TOrg {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "org_code")
    private String orgCode;

    @Column(name = "org_name")
    private String orgName;

    @Column(name = "create_time")
    private Date createTime;
}
