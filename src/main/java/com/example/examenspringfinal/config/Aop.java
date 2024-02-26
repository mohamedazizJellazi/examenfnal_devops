package com.example.examenspringfinal.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class Aop {
//    @AfterReturning("execution(* com.example.examenspringfinal.service.IVehiculeS.addVehiculeReservationAndAffectToWashingService()(..)")
//    public void avant(JoinPoint JoinPoint) {
//        log.info("Waiting for a Worker");
//    }
}
