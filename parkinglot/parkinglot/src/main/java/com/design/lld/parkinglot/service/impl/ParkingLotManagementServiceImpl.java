package com.design.lld.parkinglot.service.impl;

import com.design.lld.parkinglot.dto.ParkingLotDto;
import com.design.lld.parkinglot.dto.SlotDto;
import com.design.lld.parkinglot.dto.VehicleDto;
import com.design.lld.parkinglot.entity.ParkingLot;
import com.design.lld.parkinglot.entity.Slot;
import com.design.lld.parkinglot.entity.Vehicle;
import com.design.lld.parkinglot.service.IParkingLotManagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingLotManagementServiceImpl implements IParkingLotManagementService {
    @Override
    public void createParkingLot(ParkingLotDto parkingLotDto) {

    }

    @Override
    public void bookParkingLot(VehicleDto vehicleDto) {

    }

    @Override
    public void vacateParkingLot(ParkingLotDto parkingLotDto) {

    }

    @Override
    public SlotDto getSlotStatus(SlotDto slotDto) {
        return null;
    }

    @Override
    public List<Slot> getAllSlots(ParkingLotDto parkingLotDto) {
        return null;
    }
}
