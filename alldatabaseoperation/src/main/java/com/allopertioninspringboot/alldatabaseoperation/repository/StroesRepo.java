package com.allopertioninspringboot.alldatabaseoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allopertioninspringboot.alldatabaseoperation.entity.Stroes;

@Repository
public interface StroesRepo extends JpaRepository<Stroes, Long> {

}
