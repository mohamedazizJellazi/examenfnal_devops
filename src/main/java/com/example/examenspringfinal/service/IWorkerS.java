package com.example.examenspringfinal.service;

import com.example.examenspringfinal.entities.Worker;

import java.util.List;

public interface IWorkerS {
    public List<Worker> retrieveAllWorkers();
    public Worker ajouterWorker(Worker w);
}
