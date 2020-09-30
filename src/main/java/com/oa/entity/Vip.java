package com.oa.entity;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/30 9:08
 * @Description: vip实体类
 */
public class Vip {
    private int id;
    private String content;
    private String u_no;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getU_no() {
        return u_no;
    }

    public void setU_no(String u_no) {
        this.u_no = u_no;
    }

    public Vip() {
    }

    public Vip(int id, String content, String u_no) {
        this.id = id;
        this.content = content;
        this.u_no = u_no;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", u_no='" + u_no + '\'' +
                '}';
    }
}
