package com.pedro.crud.services;

import com.pedro.crud.entities.Order;
import com.pedro.crud.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> orderOptinal = orderRepository.findById(id);
        return orderOptinal.get();
    }
}
