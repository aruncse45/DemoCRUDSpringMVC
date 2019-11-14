package com.demo.bean;

public class Person {


    private int pId;
    private String firstName;
    private String lastName;
    private int age;


    public Person() {
    }

    public Person(int pId, String firstName, String lastName, int age) {
        this.pId = pId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getpId() {
        return pId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Person Id :" + getpId() + "First Name :" + getFirstName() + "Last Name :" + getLastName() + "Age :" + getAge() );
        return builder.toString();
    }
}
