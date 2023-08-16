package com.example.j6store.rest.controller;

import com.example.j6store.entity.Role;
import com.example.j6store.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/roles")
public class RoleRestController {
    @Autowired
    RoleService rService;

    @GetMapping
    public List<Role> getAll(){
        return rService.findAll();
    }
}
