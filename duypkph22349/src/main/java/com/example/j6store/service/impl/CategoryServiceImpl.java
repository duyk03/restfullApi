package com.example.j6store.service.impl;

import com.example.j6store.entity.Category;
import com.example.j6store.repository.CategoryRepository;
import com.example.j6store.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository cRepo;

    @Override
    public List<Category> findAll() {
        return cRepo.findAll();
    }
}
