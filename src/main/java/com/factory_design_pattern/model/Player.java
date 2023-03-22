package com.factory_design_pattern.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Player {

    @Id
    @GeneratedValue
   private int id;
   private   String name;
   private String role;
}
