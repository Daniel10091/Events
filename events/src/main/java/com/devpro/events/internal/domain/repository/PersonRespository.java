package com.devpro.events.internal.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devpro.events.internal.domain.model.Person;

public interface PersonRespository extends JpaRepository<Person, Long> {
  
}
