package com.design.lld.parkinglot.mapper;

import com.design.lld.parkinglot.dto.SlotDto;
import com.design.lld.parkinglot.entity.Slot;

public class Mapper {
    public static SlotDto slotToDto(Slot slot, SlotDto dto) {
        dto.setId(slot.getId());
        dto.setFloor(slot.getFloor());
        dto.setNumber(slot.getSlotNo());
        dto.setEmpty(slot.isEmpty());

        return dto;
    }

    public static Slot slotDtoToSlot(Slot slot, SlotDto dto) {
        slot.setId(dto.getId());
        slot.setSlotNo(dto.getNumber());
        slot.setFloor(dto.getFloor());
        slot.setEmpty(dto.isEmpty());

        return slot;
    }
}
