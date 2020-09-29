package com.oa.entity;

import java.util.Date;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 11:27
 * @Description:
 */
public class Course {
    private int id;
    private String name;
    private Date createtime;
    private int week;
    private int type;
    private int flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Course() {
    }

    public Course(int id, String name, Date createtime, int week, int type, int flag) {
        this.id = id;
        this.name = name;
        this.createtime = createtime;
        this.week = week;
        this.type = type;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createtime=" + createtime +
                ", week=" + week +
                ", type=" + type +
                ", flag=" + flag +
                '}';
    }
}
