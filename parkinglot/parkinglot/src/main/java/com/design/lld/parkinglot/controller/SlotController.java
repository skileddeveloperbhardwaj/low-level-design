package com.design.lld.parkinglot.controller;

import com.design.lld.parkinglot.dto.ResponseDto;
import com.design.lld.parkinglot.dto.SlotDto;
import com.design.lld.parkinglot.service.ISlotManagementService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
@AllArgsConstructor
@Validated
public class SlotController {
    @Autowired
    private ISlotManagementService iSlotManagementService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createSlot(@Valid @RequestBody SlotDto slotDto) {
        iSlotManagementService.addSlot(slotDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto());
    }
}
