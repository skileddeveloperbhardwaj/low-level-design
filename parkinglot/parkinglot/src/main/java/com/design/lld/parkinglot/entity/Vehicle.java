package com.design.lld.parkinglot.entity;

import com.design.lld.parkinglot.common.VehicleType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "vehicle")
public class Vehicle extends BaseEntity{
    @Id
    @GeneratedValue
    private String id;
    private VehicleType vehicleType;

    private String regNo;
    private String color;
}
