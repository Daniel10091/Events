package com.devpro.events.internal.domain.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.devpro.events.internal.domain.enumerator.Visibility;

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
@Table(name = "event")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Event {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private Long id;
  
  @Column(nullable = false)
  private String name;
  
  @Column(nullable = false)
  private String description;
  
  @Column(nullable = false)
  private String organizer;
  
  private Address location;
  
  private Phone contact;
  
  private String website;
  
  private String image;

  @Column(nullable = false)
  private String category;

  private String tags;

  private String status;

  @Column(nullable = false)
  private String type;

  @Column(nullable = false)
  private Visibility visibility = Visibility.PRIVATE;
  
  @Column(name = "start_at", nullable = false)
  private LocalDateTime startAt;
  
  @Column(name = "end_at", nullable = false)
  private LocalDateTime endAt;

  @Column(name = "created_at", nullable = false)
  @CreationTimestamp
  private LocalDateTime createdAt;
  
  @Column(name = "updated_at", nullable = false)
  @CreationTimestamp
  private LocalDateTime updatedAt;

}
