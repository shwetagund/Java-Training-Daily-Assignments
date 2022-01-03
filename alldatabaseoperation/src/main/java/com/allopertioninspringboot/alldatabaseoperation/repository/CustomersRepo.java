package com.allopertioninspringboot.alldatabaseoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allopertioninspringboot.alldatabaseoperation.entity.Customers;

@Repository
public interface CustomersRepo extends JpaRepository<Customers, Long> {

}
