package com.example.backend.service;



import com.example.backend.model.Role;

import java.util.List;

public interface RoleService {
    Role findByName(String name);
    List<Role> findAll();
    Role findById(long id);
}
