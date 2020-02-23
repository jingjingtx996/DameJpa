package com.aidi.demo.pojo;

import javax.persistence.*;
import java.util.Date;

/*
 * 用户实体类
 * 配置映射关系
 * 1.实体类和表的关系
 * 2.实体类属性和表中字段关系
 * @Entity:声明此类是实体类
 * @Table:配置实体类和表的映射关系  name=表名
 * */
@Entity
@Table(name = "user")
public class User {
    /*
     * @Id:声明主键
     *  @GeneratedValue(strategy = GenerationType.IDENTITY):主键自增
     * @Column(name = "user_id"):数据库表中字段的名称
     * strategy = GenerationType.IDENTITY:数据库必须支持主键自增
     * strategy = GenerationType.SEQUENCE:ORACLE数据库使用主键自增
     * strategy = GenerationType.TABLE:JPA提供的一种机制帮助我们完成主键自增
     * strategy = GenerationType.AUTO:程序帮助我们完成主键策略
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_age")
    private int userAge;
    @Column(name = "user_sex")
    private String userSex;
    @Column(name = "user_province")
    private String userProvince;
    @Column(name = "user_city")
    private String userCity;
    @Column(name = "user_time")
    private Date userTime;
    @Column(name = "user_img")
    private String userImg;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }


    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }


    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }


    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }


    public Date getUserTime() {
        return userTime;
    }

    public void setUserTime(Date userTime) {
        this.userTime = userTime;
    }


    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userSex='" + userSex + '\'' +
                ", userProvince='" + userProvince + '\'' +
                ", userCity='" + userCity + '\'' +
                ", userTime=" + userTime +
                ", userImg='" + userImg + '\'' +
                '}';
    }
}
