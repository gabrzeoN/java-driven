package com.hellospring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hellospring.api.dtos.UserDTO;
import com.hellospring.api.models.UserModel;
import com.hellospring.api.repositories.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
  
  @Autowired // responsável por criar a instância do repository dentro da classe, assim, podemos chamar os métodos do repository sem ter que instacia-lo usando o new
  private UserRepository repository;

  @GetMapping
  public List<UserModel> listAll(){
    List<UserModel> users = repository.findAll();
    return users;
  }

  @PostMapping
  public UserModel create(@RequestBody @Valid UserDTO req){ // Valid ativa as validações do DTO
    UserModel user = repository.save(new UserModel(req));
    System.out.println(new UserModel(req));
    System.out.println(req);
    return user;
  }

  @DeleteMapping
  public void deleteAll(){
    repository.deleteAll();
    return;
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id){
    repository.deleteById(id);
    return;
  }

}
