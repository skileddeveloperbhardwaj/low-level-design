package com.design.lld.parkinglot.dto;

import lombok.Data;

@Data
public class SlotDto {
    private String id;
    private int floor;
    private int number;
    private boolean isEmpty;
    private ParkingLotDto parkingLotDto;
}
