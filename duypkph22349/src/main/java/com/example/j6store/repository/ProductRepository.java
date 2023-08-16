package com.example.j6store.repository;

import com.example.j6store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query("SELECT p from Product p where p.category.id=?1")
    List<Product> findByCategoryId(String cid);
}
