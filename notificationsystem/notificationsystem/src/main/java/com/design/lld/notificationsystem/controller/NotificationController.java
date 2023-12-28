package com.design.lld.notificationsystem.controller;

import com.design.lld.notificationsystem.dto.EventDto;
import com.design.lld.notificationsystem.dto.NotificationDto;
import com.design.lld.notificationsystem.dto.ResponseDto;
import com.design.lld.notificationsystem.entity.Notification;
import com.design.lld.notificationsystem.service.INotificationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@RestController("/api")
public class NotificationController {
    @Autowired
    private INotificationService iNotificationService;

    @GetMapping("/fetch")
    public ResponseEntity<NotificationDto> fetchNotificationDetails(@RequestParam String id) {


        return ResponseEntity.status(HttpStatus.OK).body(new NotificationDto());
    }

    @PostMapping("/postNotification")
    public ResponseEntity<ResponseDto> postNotification(@RequestBody EventDto eventDto) {


        return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto());
    }
}
