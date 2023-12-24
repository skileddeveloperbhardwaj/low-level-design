package com.design.lld.parkinglot.controller;

import com.design.lld.parkinglot.dto.ParkingLotDto;
import com.design.lld.parkinglot.dto.ResponseDto;
import com.design.lld.parkinglot.dto.SlotDto;
import com.design.lld.parkinglot.dto.VehicleDto;
import com.design.lld.parkinglot.service.IParkingLotManagementService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
@AllArgsConstructor
public class ParkingLotController {
    @Autowired
    private IParkingLotManagementService iParkingLotManagementService;

    @PostMapping("/createParkingLot")
    public ResponseEntity<ResponseDto> createParkingLot(@Valid @RequestBody ParkingLotDto parkingLotDto) {
        iParkingLotManagementService.createParkingLot(parkingLotDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto());
    }

    @PostMapping("/bookParkingLot")
    public ResponseEntity<ResponseDto> bookParkingLot(@Valid @RequestBody VehicleDto vehicleDto) {
        iParkingLotManagementService.bookParkingLot(vehicleDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto());
    }

    @PostMapping("/freeParkingLot")
    public ResponseEntity<ResponseDto> freeParkingLot(@Valid @RequestBody ParkingLotDto parkingLotDto) {
        iParkingLotManagementService.vacateParkingLot(parkingLotDto);
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto());
    }

    @GetMapping("/fetchSlotStatus")
    public ResponseEntity<SlotDto> fetchSlotStatus(@Valid @RequestBody SlotDto slotDto) {
        return ResponseEntity.status(HttpStatus.OK).body(iParkingLotManagementService.getSlotStatus(slotDto));
    }
}
