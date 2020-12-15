package com.example.Application.controller;

import com.example.Application.ErrorResponse;
import com.example.Application.model.Employee;
import com.example.Application.model.Organization;
import com.example.Application.model.RollDetails;
import com.example.Application.service.ApplicationServices;
import com.example.Application.service.RollServiceManager;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@ApiOperation(value = "/", tags = "Employee Module Controller")
@RestController
@RequestMapping("/")
public class ApplicationAPI {



     @Autowired
     private ApplicationServices appService;
     @Autowired
     private RollServiceManager roleService;

     @ApiOperation(value="Fetch Employee Details", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code=200,message="SUCCESS",response = Employee.class,responseContainer = "List"),
            @ApiResponse(code=500,message="UNAUTORIZED",response = ErrorResponse.class,responseContainer = "List"),
            @ApiResponse(code=403,message="FORBIDDEN",response = ErrorResponse.class,responseContainer = "List"),
            @ApiResponse(code=404,message="NOT FOUND",response = ErrorResponse.class,responseContainer = "List")
    })
    @GetMapping("/EmployeeDetails/{id}")
    public Employee FetchEmployee(@PathVariable int id){
        return appService.getEmployee(id);
    }

    @ApiOperation(value="Fetch Organization Details", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code=200,message="SUCCESS",response = Organization.class,responseContainer = "List"),
            @ApiResponse(code=401,message="UNAUTORIZED",response = ErrorResponse.class,responseContainer = "List"),
            @ApiResponse(code=403,message="FORBIDDEN",response = ErrorResponse.class,responseContainer = "List"),
            @ApiResponse(code=404,message="NOT FOUND",response = ErrorResponse.class,responseContainer = "List")
    })
    @GetMapping("/OrganizationDetails/{id}")
    public Organization FetchOrgDetails(@PathVariable int id){

        return appService.getOrganizationDetails(id);
    }

    @ApiOperation(value="Update Employee Details", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code=200,message="SUCCESS",response = Employee.class,responseContainer = "List"),
            @ApiResponse(code=401,message="UNAUTORIZED",response = ErrorResponse.class,responseContainer = "List"),
            @ApiResponse(code=403,message="FORBIDDEN",response = ErrorResponse.class,responseContainer = "List"),
            @ApiResponse(code=404,message="NOT FOUND",response = ErrorResponse.class,responseContainer = "List")
    })
    @PutMapping(value = "/UpdateDetails",consumes = {"application/json"})
    public Employee UpdateDetails(@RequestBody Employee emp){
        return appService.updateEmployee(emp);
    }

    @ApiOperation(value="Fetch Role Details", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code=200,message="SUCCESS",response = RollDetails.class,responseContainer = "List"),
            @ApiResponse(code=401,message="UNAUTORIZED",response = ErrorResponse.class,responseContainer = "List"),
            @ApiResponse(code=403,message="FORBIDDEN",response = ErrorResponse.class,responseContainer = "List"),
            @ApiResponse(code=404,message="NOT FOUND",response = ErrorResponse.class,responseContainer = "List")
    })
    @GetMapping("/RoleDetails/{id}")
    public RollDetails FetchRoleDetails(@PathVariable int id){
        return roleService.getRollDetails(id);
    }



}
