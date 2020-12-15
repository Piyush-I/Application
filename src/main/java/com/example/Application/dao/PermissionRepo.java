package com.example.Application.dao;

import com.example.Application.model.Permission;
import org.springframework.data.repository.CrudRepository;

public interface PermissionRepo extends CrudRepository<Permission, Integer> {
}
