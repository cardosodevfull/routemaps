package com.api.routemaps.dto;

import jakarta.validation.constraints.NotBlank;

public class DeliveryDto {
    @NotBlank
    private String andress;

    public DeliveryDto() {
    }

    public DeliveryDto(String andress) {
        this.andress = andress;
    }

    public String getAndress() {
        return andress;
    }

    public void setAndress(String andress) {
        this.andress = andress;
    }
}
