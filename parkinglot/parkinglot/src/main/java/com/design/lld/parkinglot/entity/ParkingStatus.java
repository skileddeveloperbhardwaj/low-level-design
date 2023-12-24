package com.design.lld.parkinglot.entity;

import com.design.lld.parkinglot.common.VehicleType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "parkingstatus")
public class ParkingStatus extends BaseEntity{
    @Id
    @GeneratedValue
    private String id;
    private Vehicle vehicle;
    private Slot slot;
}
