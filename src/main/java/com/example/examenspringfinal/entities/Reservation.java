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

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    LocalDateTime timeReservation;
    @Enumerated(value = EnumType.STRING)
    Status status;
    @ManyToOne(fetch =FetchType.EAGER,cascade=CascadeType.DETACH)
    @JsonIgnoreProperties("reservations")
    private Worker worker ;
    @ManyToMany(fetch =FetchType.EAGER)
    @JsonIgnoreProperties("reservations")
    private Set<Washing_Service> WServices;
}
