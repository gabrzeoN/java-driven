package com.hellospring.api.dtos;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

// DTOs são representações dos dados de uma requisição
public record UserDTO(

    @NotBlank // Não pode ser nulo ou espaço vazio
    String name,

    @NotBlank
    String lastname,

    @Past // Obrigatório ser uma data (tipo Date) do passado (Formato americado ano-mes-dia)
    Date birthdate,

    @Pattern(regexp = "\\(\\d{2}\\)\\s\\d{4,5}\\-\\d{4}")
    String phone,

    @Email
    @NotNull // Não pode ser nulo, porém entende espaço vazio como não nulo
    String email

) {
}
