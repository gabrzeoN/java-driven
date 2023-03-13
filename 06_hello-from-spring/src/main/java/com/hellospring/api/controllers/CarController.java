package com.hellospring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hellospring.api.dtos.CarDTO;
import com.hellospring.api.models.CarModel;
import com.hellospring.api.repositories.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarController {
  
  @Autowired // responsável por criar a instância do repository dentro da classe, assim, podemos chamar os métodos do repository sem ter que instacia-lo usando o new
  private CarRepository repository;

  @GetMapping
  public List<CarModel> listCarAll(){
    List<CarModel> cars = repository.findAll();
    System.out.println(cars);
    return cars;
  }

  @PostMapping
  public void createCar(@RequestBody CarDTO req){
    repository.save(new CarModel(req));
    System.out.println(new CarModel(req));
    System.out.println(req);
  }

}
