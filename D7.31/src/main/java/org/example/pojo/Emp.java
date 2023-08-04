package org.example.pojo;

import java.time.LocalDate;
import java.util.Date;

public class Emp {
    //id, name, etime, money, height, dept_id
    private Integer id;
    private String name;
    private LocalDate etime;
    private Integer money;
    private Double height;
    private Integer deptId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEtime() {
        return etime;
    }

    public void setEtime(LocalDate etime) {
        this.etime = etime;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}
