package com.example.Application.dao;

import com.example.Application.model.RolePermission;
import org.springframework.data.repository.CrudRepository;

public interface RolePermMapRepo extends CrudRepository<RolePermission, Integer> {
}
