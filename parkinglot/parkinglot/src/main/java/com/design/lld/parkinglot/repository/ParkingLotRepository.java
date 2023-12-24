package com.design.lld.parkinglot.repository;

import com.design.lld.parkinglot.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParkingLotRepository extends JpaRepository<String, Slot> {
}
