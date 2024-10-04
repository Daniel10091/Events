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
@Table(name = "presence")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Presence {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private Long id;

  @Column(name = "event_id", nullable = false)
  private Long eventId;

  @Column(name = "person_id", nullable = false)
  private Long personId;

  @Column(nullable = false)
  private Boolean confirmed;

  @Column(nullable = false)
  private Boolean attended;

  @Column(nullable = false)
  private Boolean paid;

  private String notes;

  @Column(name = "created_at", nullable = false)
  @CreationTimestamp
  private LocalDateTime createdAt;
  
  @Column(name = "updated_at", nullable = false)
  @CreationTimestamp
  private LocalDateTime updatedAt;
  
}
