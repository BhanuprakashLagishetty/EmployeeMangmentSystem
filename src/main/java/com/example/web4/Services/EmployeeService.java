package com.example.web4.Services;

import com.example.web4.Model.Employee;
import com.example.web4.Repository.Mydata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {
    public EmployeeService() {
    }

    @Autowired
    private Mydata mydata;
    public void addEmployee(Employee employee)
    {
        mydata.addEmploy(employee);
    }
    public ArrayList<Employee> viewAllEmployee(){
        return mydata.getEmployeeArrayList();
    }
    public Employee Search(String sid)
    {

        ArrayList<Employee> employees=mydata.getEmployeeArrayList();
        int n=employees.size();
        System.out.println("size of array list: "+ n);
        for(int i=0;i<n;i++)
        {
            if(employees.get(i).getEid().equals(sid))
            {
                System.out.println("true");
                return employees.get(i);
            }


        }
        return null;

    }
    public String Remove(String sid)
    {
        ArrayList<Employee> employees=mydata.getEmployeeArrayList();
        int n=employees.size();
        System.out.println("size of array list: "+ n);
        for(int i=0;i<n;i++)
        {
            if(employees.get(i).getEid().equals(sid))
            {
                employees.remove(i);
                return "Successfully removed employee";

            }


        }
        return "Employee not found";
    }
}
