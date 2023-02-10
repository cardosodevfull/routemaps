package com.api.routemaps.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class DeliveryDto {
    @NotBlank
    private String andress;
    @NotBlank
    private String complement;
    @NotBlank
    private String instruction;
    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;

    public DeliveryDto() {
    }

    public DeliveryDto(String andress, String complement, String instruction, Double latitude, Double longitude) {
        this.andress = andress;
        this.complement = complement;
        this.instruction = instruction;
        this.latitude = latitude;
        this.longitude = longitude;
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
