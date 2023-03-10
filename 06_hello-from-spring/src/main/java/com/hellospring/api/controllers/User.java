package com.hellospring.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hellospring.api.dtos.UserDTO;

@RestController
@RequestMapping("/users")
public class User {
  
  @PostMapping
  public void create(@RequestBody UserDTO req){
    System.out.println(req);
  }

}
