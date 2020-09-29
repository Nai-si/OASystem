package com.oa.entity;

import java.util.Date;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 9:53
 * @Description: 部门实体类
 */
public class Depart {

    private int id;
    private String name;
    private Date createtime;
    private int num;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Depart() {
    }

    public Depart(int id, String name, Date createtime, int num, int flag) {
        this.id = id;
        this.name = name;
        this.createtime = createtime;
        this.num = num;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Depart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createtime=" + createtime +
                ", num=" + num +
                ", flag=" + flag +
                '}';
    }
}
