package com.example.objectmapper;

import com.fasterxml.jackson.annotation.JsonProperty;

//object mapper 는 get method 를 참조하기 때문에 get을 붙일때 유의 해야한다
public class User {
    private String name;
    private int age;

    @JsonProperty(value = "phone_number")
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User(){
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public User(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
