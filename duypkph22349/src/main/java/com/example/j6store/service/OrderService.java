package com.example.j6store.service;

import com.example.j6store.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public interface OrderService {
    Order create(JsonNode orderDate);
    Order finById(Integer id);
    List<Order> findByUsername (String username);
}
