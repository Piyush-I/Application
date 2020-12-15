package com.example.Application.service;

import com.example.Application.model.Employee;
import com.example.Application.model.Organization;

public interface ServiceInterface {
    Employee getEmployee(int id);
    Organization getOrganizationDetails(int id);
    Employee updateEmployee(Employee emp);
}
