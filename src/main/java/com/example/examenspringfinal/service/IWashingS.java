package com.example.examenspringfinal.service;

import com.example.examenspringfinal.entities.Washing_Service;
import com.example.examenspringfinal.entities.Worker;

import java.util.List;

public interface IWashingS {
    public List<Washing_Service> retrieveAllWashings();
    public void addWashingService(List<Washing_Service> waL);
}
