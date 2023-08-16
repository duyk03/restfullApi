package com.example.j6store.service.impl;

import com.example.j6store.entity.Product;
import com.example.j6store.repository.ProductRepository;
import com.example.j6store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository pRepo;

    @Override
    public List<Product> findAll() {
        return pRepo.findAll();
    }

    @Override
    public Product finById(Integer id) {
        return pRepo.findById(id).get();
    }

    @Override
    public List<Product> findByCategoryId(String cid) {
        return pRepo.findByCategoryId(cid);
    }

    @Override
    public Product create(Product product) {
        return pRepo.save(product);
    }

    @Override
    public Product update(Product product) {
        return pRepo.save(product);
    }

    @Override
    public void delete(Integer id) {
        pRepo.deleteById(id);
    }
}
