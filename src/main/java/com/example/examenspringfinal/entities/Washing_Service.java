package com.example.examenspringfinal.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Washing_Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService;
    float price;
    @Enumerated(value = EnumType.STRING)
    Type type;
    @ManyToMany(fetch =FetchType.EAGER)
    @JsonIgnoreProperties("WServices")
    private Set<Reservation> reservations;
}
