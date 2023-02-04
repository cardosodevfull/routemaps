package com.api.routemaps.dto;

import com.api.routemaps.entity.Delivery;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RotaDto {
    @NotNull
    private String userName;

    @NotBlank
    private String status;

    private LocalDateTime createdAt;

    private List<Delivery> deliveries = new ArrayList<>();

    public RotaDto() {
    }

    public RotaDto(String userName, String status, LocalDateTime createdAt, List<Delivery> deliveries) {
        this.userName = userName;
        this.status = status;
        this.createdAt = createdAt;
        this.deliveries = deliveries;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }
}
