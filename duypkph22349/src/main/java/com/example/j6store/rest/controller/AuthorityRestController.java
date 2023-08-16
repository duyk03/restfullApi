package com.example.j6store.rest.controller;

import com.example.j6store.entity.Authority;
import com.example.j6store.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/authorities")
public class AuthorityRestController {
    @Autowired
    AuthorityService auService;

    @GetMapping
    public List<Authority> finAll(@RequestParam("admin")Optional<Boolean> admin){
        if (admin.orElse(false)){
            return auService.findAuthorityAdmin();
        }
        return auService.findAll();
    }

    @PostMapping
    public Authority post(@RequestBody Authority auth){
        return auService.create(auth);
    }

    @DeleteMapping("{id}")
    public  void delete(@PathVariable("id")Integer id){
        auService.delete(id);
    }
}
