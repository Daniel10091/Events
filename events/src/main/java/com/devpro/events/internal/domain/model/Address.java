package com.devpro.events.internal.domain.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private Integer id;

  @Column(nullable = false)
  private String street;

  @Column(nullable = false)
  private String city;

  @Column(nullable = false)
  private String state;

  @Column(nullable = false)
  private String zipCode;

  @Column(nullable = false)
  private String country;

  @Column(nullable = false)
  private String type;

  private String description;

  private String latitude;

  private String longitude;

  @Column(name = "created_at", nullable = false)
  @CreationTimestamp
  private LocalDateTime createdAt;

  @Column(name = "updated_at", nullable = false)
  @CreationTimestamp
  private LocalDateTime updatedAt;

}
