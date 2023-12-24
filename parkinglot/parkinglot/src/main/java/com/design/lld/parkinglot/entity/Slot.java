package com.design.lld.parkinglot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "slot")
public class Slot extends BaseEntity{
    @Id
    @GeneratedValue
    private String id;
    private int floor;
    private int slotNo;
    private boolean isEmpty;
}
