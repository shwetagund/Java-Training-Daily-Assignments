package com.hibernateemployee.springhibernateemployee.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernateemployee.springhibernateemployee.entity.Employee;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee,Long> {

}
