package com.example.tcu.checkinpro.employees;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface employeeRepository extends JpaRepository<employeeEntity, Integer> {

    Optional<employeeEntity> findByEmail(String email);
}
