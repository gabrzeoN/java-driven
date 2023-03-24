package com.hellospring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hellospring.api.dtos.UserDTO;
import com.hellospring.api.models.UserModel;
import com.hellospring.api.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
  
  @Autowired // responsável por criar a instância do repository dentro da classe, assim, podemos chamar os métodos do repository sem ter que instacia-lo usando o new
  private UserService service;

  @GetMapping
  public List<UserModel> listAll(){
    List<UserModel> users = service.listAll();
    return users;
  }

  @PostMapping
  public UserModel create(@RequestBody @Valid UserDTO dto){ // Valid ativa as validações do DTO
    UserModel user = service.create(dto);
    return user;
  }

  @DeleteMapping
  public void deleteAll(){
    service.deleteAll();
    return;
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id){
    service.delete(id);
    return;
  }

  @PutMapping("/{id}")
  public void update(@PathVariable Long id, @RequestBody @Valid UserDTO dto){
    service.update(id, dto);
    return;
  }
}
