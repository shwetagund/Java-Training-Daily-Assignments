package com.allopertioninspringboot.alldatabaseoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allopertioninspringboot.alldatabaseoperation.entity.Currencies;

@Repository
public interface CurrenciesRepo extends JpaRepository<Currencies,Long> {

}
