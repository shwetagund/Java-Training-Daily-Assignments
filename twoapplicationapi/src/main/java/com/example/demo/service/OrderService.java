package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {
  @Autowired
  private OrderRepository orderRepo;
  
  public Order saveOrder(Order order) {
	  return orderRepo.save(order);
	  }
}
