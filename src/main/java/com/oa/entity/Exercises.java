package com.oa.entity;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 17:11
 * @Description: 练习题表实体类
 */
public class Exercises {

    private Integer id;
    private String category;
    private String equestion;
    private String eanswer;
    private String flag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getEquestion() {
        return equestion;
    }

    public void setEquestion(String equestion) {
        this.equestion = equestion;
    }


    public String getEanswer() {
        return eanswer;
    }

    public void setEanswer(String eanswer) {
        this.eanswer = eanswer;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Exercises{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", equestion='" + equestion + '\'' +
                ", eanswer='" + eanswer + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}