package com.builderdemo;

/**
 * TODO<用户信息>
 *
 * @author: 小嵩
 * @date: 2017/2/7 15:32
 * @version: V1.0
 */

public class UserInfo {

    private String name;  //姓名（必填）
    private String sex;  //性别
    private int age;      //年龄
    private double height; //身高CM
    private double weight; //体重KG


    public UserInfo(String name, String sex, int age, double height, double weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
