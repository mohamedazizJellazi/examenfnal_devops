package com.example.examenspringfinal.controller;


import com.example.examenspringfinal.entities.Washing_Service;
import com.example.examenspringfinal.entities.Worker;
import com.example.examenspringfinal.service.IWashingS;
import com.example.examenspringfinal.service.IWorkerS;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/washing")
public class WashingC {
    IWashingS iWashingS;
    @GetMapping("/affichertout")
    List<Washing_Service> retrieveAllWashings(){
        return iWashingS.retrieveAllWashings();
    }
    @PostMapping("/ajouterwashings")
    void addWorker(@RequestBody List<Washing_Service> waL){
        iWashingS.addWashingService(waL);
    }
}
