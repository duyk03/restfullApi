package com.example.j6store.service.impl;

import com.example.j6store.entity.Role;
import com.example.j6store.repository.RoleRepository;
import com.example.j6store.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository rRepo;

    @Override
    public List<Role> findAll() {
        return rRepo.findAll();
    }
}
