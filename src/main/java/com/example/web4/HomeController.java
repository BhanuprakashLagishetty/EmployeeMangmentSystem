package com.example.web4;

import com.example.web4.Model.Employee;
import com.example.web4.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private EmployeeService service;


    @RequestMapping("/")
    public String home(ModelMap model)
    {
        System.out.println("HOME PAGE IS CALLED");

//        return "employeereport";
        return "index";
    }


    @RequestMapping("/GenerateEmployee")
    public String GenerateEmployee(Employee employee, Model model)
    {
        System.out.println("employee");
        service.addEmployee(employee);
//        service.viewAllEmployee();
        model.addAttribute("allEmployee",service.viewAllEmployee());
        System.out.println("progress method is called");
        return "viewEmployees";
    }
    @RequestMapping("/Singleemployee")
    public String Singleemployee()
    {
        System.out.println("Bhanuprakash");
        return "SearchEmployee";
    }
    @RequestMapping("/employeereport")
    public String employeereport()
    {
        return "employeereport";
    }
    @RequestMapping("/SearchEmployee")
    public String SearchEmployee( String eid,Model model)
    {
        System.out.println("METHOD CALLED");
        System.out.println(eid);
        Employee e2=service.Search(eid);
        System.out.println(e2.getEname());
        model.addAttribute("employee",e2);
        return "singleEmployee";
    }

    //removeing element

    @RequestMapping("/removeemployee1")
    public String removeemployee1()
    {
        return "removeemployee";
    }
    @RequestMapping("/removeemployee")
    public String removeemployee( String eid,Model model)
    {
        System.out.println("remove layer is called CALLED");
        System.out.println(eid);
        String res=service.Remove(eid);
        System.out.println(res);
        model.addAttribute("result",res);
        return "removeemployee1";
    }




}
