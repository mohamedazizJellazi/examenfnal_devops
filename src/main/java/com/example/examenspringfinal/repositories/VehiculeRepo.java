package com.example.examenspringfinal.repositories;

import com.example.examenspringfinal.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeRepo extends JpaRepository<Vehicule,Long> {
}
