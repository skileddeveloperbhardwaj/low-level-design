package com.design.lld.parkinglot.service;

import com.design.lld.parkinglot.dto.SlotDto;
import com.design.lld.parkinglot.entity.ParkingLot;
import com.design.lld.parkinglot.entity.Slot;

public interface ISlotManagementService {
    void addSlot(SlotDto slotDto);
    void removeSlot(Slot slot);
}
