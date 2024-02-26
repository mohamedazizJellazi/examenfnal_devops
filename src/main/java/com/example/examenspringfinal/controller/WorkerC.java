package com.example.examenspringfinal.controller;

import com.example.examenspringfinal.entities.Worker;
import com.example.examenspringfinal.service.IWorkerS;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/worker")
public class WorkerC {
    IWorkerS iWorkerS;
    @GetMapping("/affichertout")
    List<Worker> retrieveAllWorkers(){
        return iWorkerS.retrieveAllWorkers();
    }
    @PostMapping("/ajouterworker")
    Worker addWorker(@RequestBody Worker w){
        return iWorkerS.ajouterWorker(w);
    }
}
