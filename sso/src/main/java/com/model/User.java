package com.model;

public class User {
    private int id;
    private String name;
    private int age;
    private double money;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String setName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }
}