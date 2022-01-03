package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {



}