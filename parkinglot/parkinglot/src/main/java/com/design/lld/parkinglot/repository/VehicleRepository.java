package com.design.lld.parkinglot.repository;

import com.design.lld.parkinglot.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<String, Vehicle> {
}
