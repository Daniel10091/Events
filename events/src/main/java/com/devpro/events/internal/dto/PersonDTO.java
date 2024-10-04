package com.devpro.events.internal.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonDTO implements Serializable {
  
  private Long code;
  private String name;
  private LocalDate birthDate;
  // private Set<Phone> phones = new LinkedHashSet<>();
  // private Set<Address> addresses = new LinkedHashSet<>();
  // private Set<Email> emails = new LinkedHashSet<>();
  // private User user;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

}
