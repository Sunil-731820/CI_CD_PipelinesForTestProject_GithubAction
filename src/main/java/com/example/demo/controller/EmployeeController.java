package com.example.demo.controller;

import com.example.demo.entities.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        List<Employee> listofEmployee =  employeeService.getAllEmployees();
        model.addAttribute("employees", listofEmployee); 
        return "employees"; // JSP file name (employees.jsp)
    }
    
    
 // Show add employee form
    @GetMapping("/addEmployee")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "addEmployee"; // addEmployee.jsp
    }

    // Handle form submission
    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/employees";
    }

    // Fetch employee by ID
    @GetMapping("/employee/{id}")
    public String getEmployeeById(@PathVariable String id, Model model) {
        Employee emp = employeeRepository.findById(id).orElse(null);
        model.addAttribute("employee", emp);
        return "employeeDetail"; // employeeDetail.jsp
    }

    // Delete employee
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable String id) {
        employeeRepository.deleteById(id);
        return "redirect:/employees";
    }
    
 // Edit Employee
    @GetMapping("/editEmployee/{id}")
    public String showEditForm(@PathVariable String id, Model model) {
        Employee emp = employeeRepository.findById(id).orElse(null);
        model.addAttribute("employee", emp);
        return "editEmployee"; // editEmployee.jsp
    }

    @PostMapping("/editEmployee")
    public String updateEmployee(@ModelAttribute Employee employee) {
        employeeRepository.save(employee); // save() updates if ID exists
        return "redirect:/employees";
    }

    
}
