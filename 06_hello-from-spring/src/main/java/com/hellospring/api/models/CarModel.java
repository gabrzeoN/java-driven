package com.hellospring.api.models;

import com.hellospring.api.dtos.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

// Modelo é representação do banco de dados
@Data
@Entity
@NoArgsConstructor // Indicar que a classe pode ser iniciada com construtor sem argumentos, já que criamos um construtor com argumentos
public class CarModel {

  public CarModel(CarDTO data) {
    this.model = data.model();
    this.year = data.year();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 50, nullable = false)
  private String model;

  @Column(nullable = false)
  private int year;
}
