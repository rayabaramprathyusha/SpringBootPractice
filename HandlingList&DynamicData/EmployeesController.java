
package com.example.hellospring;
import java.util.*;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return List.of(
            new Employee("Vinny",87000),
            new Employee("Jinny",25000),
            new Employee("Jonny",9000));
    }
}
