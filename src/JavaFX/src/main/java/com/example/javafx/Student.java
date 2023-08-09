package com.example.javafx;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String nameClass;
    private String gender;
    private String myDate;
    private String numberPhone;

    public Student (){

    }

    public Student(String name, String nameClass,String gender,String myDate) {
        this.name = name;
        this.nameClass = nameClass;
        this.gender = gender;
        this.myDate = myDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMyDate() {
        return myDate;
    }

    public void setMyDate(String myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nameClass='" + nameClass + '\'' +
                ", gender='" + gender + '\'' +
                ", " +
                "Date='" + myDate + '\'' +
                '}';
    }
}
