package com.example.j6store.rest.controller;

import com.example.j6store.entity.Account;
import com.example.j6store.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/accounts")
public class AccountRestController {
    @Autowired
    AccountService aService;

    @GetMapping
    public List<Account> getAccounts(@RequestParam("admin")Optional<Boolean> admin){
        if (admin.orElse(false)){
            return aService.getAdmin();
        }
        return aService.findAll();
    }
}
