package com.example.javafx;

public class SinhVien {
    private int id;
    private String name;
    private String name_class;
    private boolean gender;
    private String address;
    public SinhVien(){
    }

    public SinhVien(int id, String name, String name_class, boolean gender, String address) {
        this.id = id;
        this.name = name;
        this.name_class = name_class;
        this.gender = gender;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_class() {
        return name_class;
    }

    public void setName_class(String name_class) {
        this.name_class = name_class;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", name_class='" + name_class + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }
}
