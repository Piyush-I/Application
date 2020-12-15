package com.example.Application.dao;

import com.example.Application.model.Organization;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepo extends CrudRepository<Organization, Integer> {

}
