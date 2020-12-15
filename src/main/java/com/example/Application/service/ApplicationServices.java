package com.example.Application.service;

import com.example.Application.dao.EmployeeRepo;
import com.example.Application.dao.OrganizationRepo;
import com.example.Application.model.Employee;
import com.example.Application.model.Organization;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Optional;
@Service
public class ApplicationServices implements ServiceInterface {
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    OrganizationRepo orgRepo;
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public Employee getEmployee(int id) {
        Optional<Employee> employee = this.employeeRepo.findById(id);
        return employee.get();
    }

   @Override
    public Organization getOrganizationDetails(int id) {
       String url = "http://localhost:8090/EmployeeDetails/" + Integer.toString(id);
       Employee employee =  restTemplate.getForObject(url,Employee.class);
       int employeeId =  employee.getOrganizationId();
       Optional<Organization> orgDetails = this.orgRepo.findById(employeeId);
       return orgDetails.get();

    }

    @Override
    public Employee updateEmployee(Employee emp) {
        this.employeeRepo.save(emp);
        return emp;
    }
}
