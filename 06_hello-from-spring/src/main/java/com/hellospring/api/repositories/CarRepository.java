package com.hellospring.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellospring.api.models.CarModel;

// Usar JPA para não precisar criar os métodos de create, delete, update
// Long se refere ao tipo do ID dentro do CarModel
public interface CarRepository extends JpaRepository<CarModel, Long> {
  
}
