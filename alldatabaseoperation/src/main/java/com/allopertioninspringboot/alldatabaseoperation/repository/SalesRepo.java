package com.allopertioninspringboot.alldatabaseoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allopertioninspringboot.alldatabaseoperation.entity.Sales;

@Repository
public interface SalesRepo extends JpaRepository<Sales,Long> {

}
