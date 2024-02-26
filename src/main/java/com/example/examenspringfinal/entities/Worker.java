package com.example.examenspringfinal.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgent;
    String name;
    String nic;
    @OneToMany(mappedBy = "worker",fetch =FetchType.EAGER,cascade=CascadeType.REMOVE)
    @JsonIgnoreProperties("worker")
    private Set<Reservation> reservations ;

}
