package com.example.j6store.service.impl;

import com.example.j6store.entity.Account;
import com.example.j6store.entity.Authority;
import com.example.j6store.repository.AccountRepository;
import com.example.j6store.repository.AuthorityRepository;
import com.example.j6store.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuhorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityRepository auRepo;

    @Autowired
    AccountRepository aRepo;

    @Override
    public List<Authority> findAuthorityAdmin() {
        List<Account> accounts = aRepo.getAdmin();
        return auRepo.authoritiesOf(accounts);
    }

    @Override
    public List<Authority> findAll() {
        return auRepo.findAll();
    }

    @Override
    public Authority create(Authority auth) {
        return auRepo.save(auth);
    }

    @Override
    public void delete(Integer id) {
            auRepo.deleteById(id);
    }
}
