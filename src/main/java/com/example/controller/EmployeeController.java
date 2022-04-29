package com.example.controller;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dao.EmpJdbcDao;
import com.example.model.Employee;
@RestController
@RequestMapping(path = "employee")
public class EmployeeController {
    private final EmpJdbcDao employeeService;
    public EmployeeController(EmpJdbcDao employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public List<Employee> allEmployee(){
        return employeeService.list();
    }


    @PostMapping
    public int createEmployee(@RequestBody Employee employee){
        return employeeService.create(employee);
    }
    
    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @PutMapping("{id}")
    public int updateEmployee(@PathVariable Integer id,@RequestBody Employee employee){
        System.out.println(id+"id"+employee);
        return employeeService.update(employee,id);
    }
    
    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @DeleteMapping("{id}")
    public int deleteEmployee(@PathVariable("id") Integer id){
        return employeeService.delete(id);
    }
}
