package com.example.j6store.service;

import com.example.j6store.entity.Authority;

import java.util.List;

public interface AuthorityService {
    List<Authority> findAuthorityAdmin();

    List<Authority> findAll();

    Authority create(Authority auth);

    void delete(Integer id);
}
