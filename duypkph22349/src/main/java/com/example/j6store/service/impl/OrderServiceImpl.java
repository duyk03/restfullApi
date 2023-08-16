package com.example.j6store.service.impl;

import com.example.j6store.entity.Order;
import com.example.j6store.entity.OrderDetail;
import com.example.j6store.repository.OrderDetailRepository;
import com.example.j6store.repository.OrderRepository;
import com.example.j6store.service.OrderService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository oRepo;

    @Autowired
    OrderDetailRepository odRepo;

    @Override
    public Order create(JsonNode orderDate) {
        ObjectMapper mapper = new ObjectMapper();
        Order order = mapper.convertValue(orderDate, Order.class);
        oRepo.save(order);
        TypeReference<List<OrderDetail>> typeReference = new TypeReference<List<OrderDetail>>(){};
        List<OrderDetail> details = mapper.convertValue(orderDate.get("orderDetails"),typeReference)
                .stream().peek((d -> d.setOrder(order))).collect(Collectors.toList());
        odRepo.saveAll(details);
        return null;
    }

    @Override
    public Order finById(Integer id) {
        return oRepo.findById(id).get();
    }

    @Override
    public List<Order> findByUsername(String username) {
        return oRepo.findByUsername(username);
    }
}
