package com.design.lld.parkinglot.service.impl;

import com.design.lld.parkinglot.dto.SlotDto;
import com.design.lld.parkinglot.entity.ParkingLot;
import com.design.lld.parkinglot.entity.Slot;
import com.design.lld.parkinglot.entity.Vehicle;
import com.design.lld.parkinglot.service.IParkingLotManagementService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingLotManagementServiceImpl implements IParkingLotManagementService {
    @Override
    public void createParkingLot(List<Slot> slots, ParkingLot parkingLot) {

    }

    @Override
    public void bookParkingLot(Slot slot, Vehicle vehicle) {

    }

    @Override
    public void vacateParkingLot(Slot slot) {

    }

    @Override
    public SlotDto getSlotStatus(Slot slot) {
        return null;
    }

    @Override
    public List<Slot> getAllSlots(ParkingLot parkingLot) {
        return null;
    }
}
