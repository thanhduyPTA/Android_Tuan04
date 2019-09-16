package com.example.student.tuan05_app_bai05;

public class EmployeePartTime extends Employee {
    @Override
    public double tinhluong() {
        return 150;
    }

    @Override
    public String toString() {
        return super.toString() + " ----> Part time = " + tinhluong();
    }
}
