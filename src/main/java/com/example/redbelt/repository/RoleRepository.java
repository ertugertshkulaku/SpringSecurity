package com.example.redbelt.repository;

import java.util.Optional;

import com.example.redbelt.model.ERole;
import com.example.redbelt.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}