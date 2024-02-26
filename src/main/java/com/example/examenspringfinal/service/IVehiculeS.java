package com.example.examenspringfinal.service;

import com.example.examenspringfinal.entities.Vehicule;

import java.util.List;

public interface IVehiculeS {

    public Vehicule addVehiculeReservationAndAffectToWashingService(Vehicule vehicule, List<Long> idService);
}
