package com.example.web4.Repository;

import com.example.web4.Model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class Mydata {
    private ArrayList<Employee> employeeArrayList=new ArrayList<>();

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeArrayList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeArrayList = employeeArrayList;
    }

    public void addEmploy(Employee employee) {
        employeeArrayList.add(employee);
        System.out.println("employee is added");
        System.out.println(getEmployeeArrayList());
    }
}
