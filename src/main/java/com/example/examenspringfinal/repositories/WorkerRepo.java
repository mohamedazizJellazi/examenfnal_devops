package com.example.examenspringfinal.repositories;

import com.example.examenspringfinal.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepo extends JpaRepository<Worker,Long> {
}
