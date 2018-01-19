package com.mwj.model;

import java.util.Date;

public class Student {
    private Integer stuId;

    private String stuName;

    private String stuSex;

    private Date stuHiredate;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public Date getStuHiredate() {
        return stuHiredate;
    }

    public void setStuHiredate(Date stuHiredate) {
        this.stuHiredate = stuHiredate;
    }

    public Student() {
    }

    public Student(Integer stuId, String stuName, String stuSex, Date stuHiredate) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuHiredate = stuHiredate;
    }
}