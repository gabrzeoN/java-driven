package com.hellospring.api.dtos;


// DTOs são representações dos dados de uma requisição
public record UserDTO(String name, String lastname, int age) {
  
}
