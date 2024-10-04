package com.devpro.events.internal.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devpro.events.internal.domain.model.Person;
import com.devpro.events.internal.domain.repository.PersonRespository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PersonService {
  
  private final PersonRespository personRespository;

  public PersonService(PersonRespository personRespository) {
    this.personRespository = personRespository;
  }
  
  public List<Person> getAllPeople() {
    return personRespository.findAll();
  }
  
  public Person findPersonById(Long id) {
    return personRespository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Person with id " + id + " not found"));
  }

}
