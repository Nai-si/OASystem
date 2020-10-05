package com.oa.entity;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 16:48
 * @Description: 技术问题表实体类
 */
public class Skill {
    private Integer id;
    private String content;
    private String createTime;
    private String u_no;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getU_no() {
        return u_no;
    }

    public void setU_no(String u_no) {
        this.u_no = u_no;
    }
}
