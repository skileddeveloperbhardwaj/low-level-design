package com.design.lld.parkinglot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "parkinglot")
public class ParkingLot extends BaseEntity{
    @Id
    @GeneratedValue
    private String id;
    @OneToMany
    private List<Slot> slots;
    private int floor;
}
