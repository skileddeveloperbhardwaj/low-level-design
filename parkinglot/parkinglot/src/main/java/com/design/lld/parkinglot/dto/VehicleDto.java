package com.design.lld.parkinglot.dto;

import com.design.lld.parkinglot.common.VehicleType;
import com.design.lld.parkinglot.entity.Slot;
import lombok.Data;

@Data
public class VehicleDto {
    private String id;
    private String regNo;
    private String color;
    private VehicleType vehicleType;
    private SlotDto slotDto;
}
