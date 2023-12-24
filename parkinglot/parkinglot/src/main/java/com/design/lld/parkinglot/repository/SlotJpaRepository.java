package com.design.lld.parkinglot.repository;

import com.design.lld.parkinglot.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotJpaRepository extends JpaRepository<Slot, String> {
}
