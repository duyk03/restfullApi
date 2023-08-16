package com.example.j6store.service.impl;

import com.example.j6store.entity.Account;
import com.example.j6store.repository.AccountRepository;
import com.example.j6store.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository aRepo;

    @Override
    public Account findById(String username) {
        return aRepo.findById(username).get();
    }

    @Override
    public List<Account> findAll() {
        return aRepo.findAll();
    }

    @Override
    public List<Account> getAdmin() {
        return aRepo.getAdmin();
    }
}
