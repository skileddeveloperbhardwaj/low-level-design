package com.design.lld.parkinglot.service.impl;

import com.design.lld.parkinglot.dto.SlotDto;
import com.design.lld.parkinglot.entity.ParkingLot;
import com.design.lld.parkinglot.entity.Slot;
import com.design.lld.parkinglot.mapper.Mapper;
import com.design.lld.parkinglot.repository.SlotJpaRepository;
import com.design.lld.parkinglot.service.ISlotManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SlotManagementServiceImpl implements ISlotManagementService {
    @Autowired
    private SlotJpaRepository slotJpaRepository;
    @Override
    public void addSlot(SlotDto slotDto) {
        slotJpaRepository.save(Mapper.slotDtoToSlot(new Slot(), slotDto));
    }

    @Override
    public void removeSlot(Slot slot) {

    }
}
