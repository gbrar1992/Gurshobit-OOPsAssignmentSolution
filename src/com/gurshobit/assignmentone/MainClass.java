package com.gurshobit.assignmentone;

import com.gurshobit.assignmentone.child.AdminDepartment;
import com.gurshobit.assignmentone.child.HrDepartment;
import com.gurshobit.assignmentone.child.TechDepartment;

public class MainClass {
    public static void main(String[] args) {
        // Objects
        AdminDepartment adminDepartment = new AdminDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();

        // Methods Called Admin Department
        System.out.println("Welcome to "+adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(adminDepartment.isTodayAHoliday());
        System.out.println();

        // Methods Called Hr Department
        System.out.println("Welcome to " + hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.isTodayAHoliday());
        System.out.println();

        // Methods Called Tech Department
        System.out.println("Welcome to " + techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(techDepartment.isTodayAHoliday());

    }
}
