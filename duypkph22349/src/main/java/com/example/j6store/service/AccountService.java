package com.example.j6store.service;

import com.example.j6store.entity.Account;

import java.util.List;

public interface AccountService {
    Account findById(String username);

    List<Account> findAll();

    List<Account> getAdmin();
}
