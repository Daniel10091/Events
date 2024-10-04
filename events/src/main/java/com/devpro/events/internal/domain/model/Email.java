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
@Table(name = "email")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Email {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private Long id;
  
  @Column(nullable = false)
  private String address;
  
  @Column(name = "created_at", nullable = false)
  @CreationTimestamp
  private LocalDateTime createdAt;
  
  @Column(name = "updated_at", nullable = false)
  @CreationTimestamp
  private LocalDateTime updatedAt;

}
