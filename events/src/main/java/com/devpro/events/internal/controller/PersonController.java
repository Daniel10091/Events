package com.devpro.events.internal.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devpro.events.internal.domain.model.Person;
import com.devpro.events.internal.domain.service.PersonService;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
  
  private final PersonService personService;

  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  public ResponseEntity<List<Person>> getAllPeople() {
    return ResponseEntity.ok(personService.getAllPeople());
  }

  public ResponseEntity<?> create() {
    return ResponseEntity.ok().build();
  }

}
