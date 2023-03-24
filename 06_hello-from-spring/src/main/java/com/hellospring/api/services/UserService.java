package com.hellospring.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellospring.api.dtos.UserDTO;
import com.hellospring.api.models.UserModel;
import com.hellospring.api.repositories.UserRepository;

@Service // Propósito semântico, apenas referenciando a nossa classe como um service.
public class UserService {
  
  @Autowired // Nos ajuda a não precisar criar instância do repository que está sendo armazenado na propriedade.
  private UserRepository repository;

  public List<UserModel> listAll(){
    List<UserModel> users = repository.findAll();
    return users;
  }

  public UserModel create(UserDTO req){ // Valid ativa as validações do DTO
    UserModel user = repository.save(new UserModel(req));
    // System.out.println(user);
    System.out.println(new UserModel(req));
    // System.out.println(req);
    return user;
  }

  public void deleteAll(){
    repository.deleteAll();
    return;
  }

  public void delete(Long id){
    repository.deleteById(id);
    return;
  }

  public void update(Long id,UserDTO req){
    repository.findById(id).map(user -> {
      user.setName(req.name());
      user.setLastname(req.lastname());
      user.setEmail(req.email());
      user.setBirthdate(req.birthdate());
      user.setPhone(req.phone());
      UserModel userUpdated = repository.save(user);
      return userUpdated;
    });
    return;
  }
}
