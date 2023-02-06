package com.anaplan.dryprinciplesdesignpatterns.modal;

import java.sql.Timestamp;

public class Employee {
    private Long eid;
    private Timestamp registredTime;

    private String name;

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public Timestamp getRegistredTime() {
        return registredTime;
    }

    public void setRegistredTime(Timestamp registredTime) {
        this.registredTime = registredTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", registredTime=" + registredTime +
                ", name='" + name + '\'' +
                '}';
    }
}

