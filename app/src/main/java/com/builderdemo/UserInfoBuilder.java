package com.builderdemo;

import android.widget.TextView;

/**
 * TODO<用户信息的建造者>
 *
 * @author: 小嵩
 * @date: 2017/2/7 16:05
 * @version: V1.0
 */

public class UserInfoBuilder {
    private String name;  //姓名 （必填，在初始化时，传入参数）
    private String sex;  //性别
    private int age;      //年龄
    private double height; //身高CM
    private double weight; //体重KG


    public UserInfoBuilder(String name){
        this.name = name;
    }

        public UserInfoBuilder setSex(String sex){
            this.sex = sex;
            return this;
        }
        public UserInfoBuilder setAge(int age){
            this.age = age;
            return this;
        }
        public UserInfoBuilder setHeight(double height){
            this.height = height;
            return this;
        }
        public UserInfoBuilder setWeight(double weight){
            this.weight = weight;
            return this;
        }
        public UserInfoBuilder into(TextView textView){
            textView.setText("姓名："+name+"\n性别："+sex+"\n年龄："+age+"\n身高："+height+"\n体重："+weight);
            return this;
        }

        public UserInfo create(){
            return new UserInfo(name, sex, age, height, weight);
        }
}
