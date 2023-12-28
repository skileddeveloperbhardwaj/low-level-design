package com.design.lld.notificationsystem.repository;

import com.design.lld.notificationsystem.dto.NotificationDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationDto, String> {
}
