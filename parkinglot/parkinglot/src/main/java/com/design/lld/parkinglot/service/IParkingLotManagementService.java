package com.design.lld.parkinglot.service;

import com.design.lld.parkinglot.dto.SlotDto;
import com.design.lld.parkinglot.entity.ParkingLot;
import com.design.lld.parkinglot.entity.Slot;
import com.design.lld.parkinglot.entity.Vehicle;

import java.util.List;

public interface IParkingLotManagementService {
    void createParkingLot(List<Slot> slots, ParkingLot parkingLot);
    void bookParkingLot(Slot slot, Vehicle vehicle);
    void vacateParkingLot(Slot slot);
    SlotDto getSlotStatus(Slot slot);
    List<Slot> getAllSlots(ParkingLot parkingLot);
}
