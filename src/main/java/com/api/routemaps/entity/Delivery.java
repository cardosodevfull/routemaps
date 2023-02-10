package com.api.routemaps.entity;

import com.api.routemaps.Enum.StatusEnum;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "delivery")
public class Delivery {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String andress;
    private String complement;
    private String instruction;

    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    private Double latitude;
    private Double longitude;

    public Delivery() {
    }

    public Delivery(UUID id, String andress, String complement, String instruction, StatusEnum status, Double latitude, Double longitude) {
        this.id = id;
        this.andress = andress;
        this.complement = complement;
        this.instruction = instruction;
        this.status = status;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAndress() {
        return andress;
    }

    public void setAndress(String andress) {
        this.andress = andress;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
