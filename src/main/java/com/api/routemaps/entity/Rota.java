package com.api.routemaps.entity;

import com.api.routemaps.Enum.RotaEnum;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "rota")
public class Rota {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToMany(targetEntity = Delivery.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "rota_id", referencedColumnName = "id")
    private List<Delivery> deliveries = new ArrayList<>();

    @Column(name = "user_name", nullable = false, length = 100)
    private String userName;

    @Column(name = "user_currier", nullable = false)
    private String userCurrier;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Double distance;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RotaEnum status;

    private LocalDateTime createdAt;

    public Rota() {
    }

    public Rota(UUID id, List<Delivery> deliveries, String userName, String userCurrier, Double price, Double distance, RotaEnum status, LocalDateTime createdAt) {
        this.id = id;
        this.deliveries = deliveries;
        this.userName = userName;
        this.userCurrier = userCurrier;
        this.price = price;
        this.distance = distance;
        this.status = status;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
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

    public RotaEnum getStatus() {
        return status;
    }

    public void setStatus(RotaEnum status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
