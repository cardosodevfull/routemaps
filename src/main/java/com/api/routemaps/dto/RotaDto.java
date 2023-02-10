package com.api.routemaps.dto;

import com.api.routemaps.entity.Delivery;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

public class RotaDto {
    @NotNull
    private String userName;

    @NotNull
    private String userCurrier;

    @NotNull
    private Double price;

    @NotNull
    private Double distance;

    @OneToMany
    private List<Delivery> deliveries = new ArrayList<>();

    public RotaDto() {
    }

    public RotaDto(String userName, String userCurrier, Double price, Double distance, List<Delivery> deliveries) {
        this.userName = userName;
        this.userCurrier = userCurrier;
        this.price = price;
        this.distance = distance;
        this.deliveries = deliveries;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCurrier() {
        return userCurrier;
    }

    public void setUserCurrier(String userCurrier) {
        this.userCurrier = userCurrier;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

}
