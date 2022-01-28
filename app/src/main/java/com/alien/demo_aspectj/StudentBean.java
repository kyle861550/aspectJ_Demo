package com.alien.demo_aspectj;

public class StudentBean {

    private String name;
    private int age;
    private long id;
    private String address;
    private String phone;

    // 第一個設定 name 的地方
    public StudentBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 第二個設定 name 的地方
    public StudentBean(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // 第三個設定 name 的地方
    public StudentBean(String name, int age, long id, String address, String phone) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    // 第四個設定 name 的地方
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOther(long id, String address) {
        this.id = id;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
