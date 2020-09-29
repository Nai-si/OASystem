package com.oa.entity;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 8:56
 * @Description:    员工实体类
 */
public class Staff {
    private int id;
    private String u_no;
    private String did;
    private String d_name;
    private int flag;
    private String sex;
    private String email;
    private String qq;
    private String phone;
    private String heading;
    private String entryTime;
    private String name;
    private String dName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getU_no() {
        return u_no;
    }

    public void setU_no(String u_no) {
        this.u_no = u_no;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Staff() {
    }

    public Staff(int id, String u_no, String did, String d_name, int flag, String sex, String email, String qq, String phone, String heading, String entryTime, String name, String dName) {
        this.id = id;
        this.u_no = u_no;
        this.did = did;
        this.d_name = d_name;
        this.flag = flag;
        this.sex = sex;
        this.email = email;
        this.qq = qq;
        this.phone = phone;
        this.heading = heading;
        this.entryTime = entryTime;
        this.name = name;
        this.dName = dName;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", u_no='" + u_no + '\'' +
                ", did='" + did + '\'' +
                ", d_name='" + d_name + '\'' +
                ", flag=" + flag +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                ", heading='" + heading + '\'' +
                ", entryTime='" + entryTime + '\'' +
                ", name='" + name + '\'' +
                ", dName='" + dName + '\'' +
                '}';
    }
}
