package com.example.Application.service;

import com.example.Application.dao.EmployeeRepo;
import com.example.Application.dao.PermissionRepo;
import com.example.Application.dao.RolePermMapRepo;
import com.example.Application.dao.RoleRepo;
import com.example.Application.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class RollServiceManager implements RoleService {
    @Autowired
    RoleRepo roleRepo;
    @Autowired
    PermissionRepo permRepo;
    @Autowired
    RolePermMapRepo mapRepo;
    @Autowired
    EmployeeRepo emprepo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public RollDetails getRollDetails(int id) {
        String url = "http://localhost:8090/EmployeeDetails/" + Integer.toString(id);
        Employee employee =  restTemplate.getForObject(url,Employee.class);
        int rollId = employee.getRoleId();
        Optional<RolePermission> rollMap = this.mapRepo.findById(rollId);
        int permId = rollMap.get().getPermId();
        Optional<Permission> perm = this.permRepo.findById(permId);
        String permName = perm.get().getPermName();
        Optional<Role> role = this.roleRepo.findById(rollId);
        String rollname = role.get().getRollName();

        RollDetails details = new RollDetails(rollId,permId,rollname,permName);
        return details;
    }
}
