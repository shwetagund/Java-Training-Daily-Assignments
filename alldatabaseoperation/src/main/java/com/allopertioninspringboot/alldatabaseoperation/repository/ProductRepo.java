package com.allopertioninspringboot.alldatabaseoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allopertioninspringboot.alldatabaseoperation.entity.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products,Long> {

}
