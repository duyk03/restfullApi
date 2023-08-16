package com.example.j6store.service;

import com.example.j6store.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product finById(Integer id);

    List<Product> findByCategoryId(String cid);

    Product create(Product product);

    Product update(Product product);

    void  delete(Integer id);
}
