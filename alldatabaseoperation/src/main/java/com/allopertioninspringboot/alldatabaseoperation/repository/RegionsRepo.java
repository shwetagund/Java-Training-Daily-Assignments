package com.allopertioninspringboot.alldatabaseoperation.repository;

import javax.swing.plaf.synth.Region;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionsRepo extends JpaRepository<Region, Long> {

}
