package com.example.Application.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@ApiModel(description = "Employee Model")
@Component
@Entity
public class Employee {

    @Id
    private int id;
    @ApiModelProperty(notes = "Organization Id of Employee", name="orgId", required = true,value="0" )
    private int organizationId;
    @ApiModelProperty(notes = "Role Id of Employee", name="roleId", required = true,value="1" )
    private int roleId;
    @ApiModelProperty(notes = "Department Id of Employee", name="deptId", required = true,value="4235" )
    private int departmentId;
    @ApiModelProperty(notes = "Phone Number of Employee", name="phNumber", required = true,value="9999" )
    private int phoneNumber;
    @ApiModelProperty(notes = "Name of Employee", name="name", required = true,value="Piyush Ingle" )
    private String name;
    @ApiModelProperty(notes = "Email of Employee", name="email", required = true,value="piyus.ingle.com" )
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", organizationId=" + organizationId +
                ", roleId=" + roleId +
                ", departmentId=" + departmentId +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
