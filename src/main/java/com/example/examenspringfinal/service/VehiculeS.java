package com.example.examenspringfinal.service;

import com.example.examenspringfinal.entities.Reservation;
import com.example.examenspringfinal.entities.Status;
import com.example.examenspringfinal.entities.Vehicule;
import com.example.examenspringfinal.entities.Washing_Service;
import com.example.examenspringfinal.repositories.ReservationRepo;
import com.example.examenspringfinal.repositories.VehiculeRepo;
import com.example.examenspringfinal.repositories.Washing_ServiceRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class VehiculeS implements IVehiculeS {
    VehiculeRepo vehiculeRepo;
    ReservationRepo reservationRepo;
    Washing_ServiceRepo washing_serviceRepo;
    @Override
    public Vehicule addVehiculeReservationAndAffectToWashingService(Vehicule vehicule, List<Long> idService) {
        Reservation r=new Reservation();
        r.setStatus(Status.PENDING);
        Set<Washing_Service> ws=new HashSet<Washing_Service>();
        for(Long id:idService){
           Washing_Service w= washing_serviceRepo.findById(id).orElse(null);
            Set<Reservation> re=new HashSet<Reservation>();
           if(w.getReservations().size()>0){
               re=w.getReservations();
           }

            re.add(r);
           w.setReservations(re);
            washing_serviceRepo.save(w);
            ws.add(w);
        }

        r.setWServices(ws);
        reservationRepo.save(r);
        //r.setTimeReservation();

        return vehiculeRepo.save(vehicule);
    }
}
