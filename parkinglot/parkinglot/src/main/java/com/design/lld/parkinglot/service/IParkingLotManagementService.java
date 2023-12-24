package com.design.lld.parkinglot.service;

import com.design.lld.parkinglot.dto.ParkingLotDto;
import com.design.lld.parkinglot.dto.SlotDto;
import com.design.lld.parkinglot.dto.VehicleDto;
import com.design.lld.parkinglot.entity.ParkingLot;
import com.design.lld.parkinglot.entity.Slot;
import com.design.lld.parkinglot.entity.Vehicle;

import java.util.List;

public interface IParkingLotManagementService {
    void createParkingLot(ParkingLotDto parkingLotDto);
    void bookParkingLot(VehicleDto vehicleDto);
    void vacateParkingLot(ParkingLotDto parkingLotDto);
    SlotDto getSlotStatus(SlotDto slotDto);
    List<Slot> getAllSlots(ParkingLotDto parkingLotDto);
}
