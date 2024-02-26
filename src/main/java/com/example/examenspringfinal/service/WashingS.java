package com.example.examenspringfinal.service;


import com.example.examenspringfinal.entities.Washing_Service;
import com.example.examenspringfinal.repositories.Washing_ServiceRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WashingS implements IWashingS {

    Washing_ServiceRepo washing_serviceRepo;
    @Override
    public List<Washing_Service> retrieveAllWashings() {
        return washing_serviceRepo.findAll();
    }

    @Override
    public void addWashingService(List<Washing_Service> waL) {
        washing_serviceRepo.saveAll(waL);
    }
}
