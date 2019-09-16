package com.example.student.tuan05_app_bai05;

public class EmployeePFullTime extends Employee {

    @Override
    public double tinhluong() {
        return 500;
    }

    @Override
    public String toString() {
        return super.toString() + " ----> Full time = " + tinhluong();
    }
}
