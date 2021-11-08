package com.rezarta.basicweb.controller;

import com.rezarta.basicweb.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @GetMapping("new-employee")
    public String getNewEmployeeView(Model model) {
        model.addAttribute("employee", new Employee());
        return "newEmployee";
    }


    @PostMapping("new-employee")
    public String submitNewEmployee(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("employee", employee);
        return "viewEmployee";
    }
}
