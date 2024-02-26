package com.example.examenspringfinal.service;

import com.example.examenspringfinal.entities.Worker;
import com.example.examenspringfinal.repositories.WorkerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WorkerS implements IWorkerS{

    WorkerRepo workerRepo;
    @Override
    public List<Worker> retrieveAllWorkers() {
        return workerRepo.findAll();
    }

    @Override
    public Worker ajouterWorker(Worker w) {
        return workerRepo.save(w);
    }
}
