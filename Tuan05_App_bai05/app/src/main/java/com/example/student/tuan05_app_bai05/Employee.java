package com.example.student.tuan05_app_bai05;

public abstract class Employee {
    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double tinhluong();

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
