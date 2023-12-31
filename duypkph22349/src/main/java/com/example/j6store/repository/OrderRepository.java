package com.example.j6store.repository;

import com.example.j6store.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    @Query("select o from Order o where o.account.username=?1")
    List<Order> findByUsername(String username);
}
