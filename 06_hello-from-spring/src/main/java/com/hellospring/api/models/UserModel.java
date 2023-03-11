package com.hellospring.api.models;

import com.hellospring.api.dtos.UserDTO;

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
public class UserModel {

  public UserModel(UserDTO data) {
    this.name = data.name();
    this.lastname = data.lastname();
    this.age = data.age();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 50, nullable = false)
  private String name;

  @Column(length = 50, nullable = false)
  private String lastname;

  @Column(nullable = false)
  private int age;
}
