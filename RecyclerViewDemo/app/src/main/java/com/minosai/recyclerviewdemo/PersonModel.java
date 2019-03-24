package com.minosai.recyclerviewdemo;

public class PersonModel {

    /*POJO Plain Old Java Objects*/
    /*Data classes*/

    String name;
    int age;

    public PersonModel() {

    }

    public PersonModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
