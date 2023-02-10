package com.api.routemaps.controller;

import com.api.routemaps.Enum.StatusEnum;
import com.api.routemaps.dto.DeliveryDto;
import com.api.routemaps.dto.RotaDto;
import com.api.routemaps.entity.Delivery;
import com.api.routemaps.entity.Rota;
import com.api.routemaps.repository.DeliveryRepository;
import com.api.routemaps.repository.RotaRepository;
import com.api.routemaps.service.RotaService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/rota")
public class RotaController {

    @Autowired
    private RotaService rotaService;
    @Autowired
    private RotaRepository rotaRepository;
    @Autowired
    private DeliveryRepository deliveryRepository;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> save(@RequestBody @Valid RotaDto rotaDto, DeliveryDto deliveryDto) {
        var rota = new Rota();
        var delivery = new Delivery();

        BeanUtils.copyProperties(rotaDto, rota);
        rota.setCreatedAt(LocalDateTime.now(ZoneId.of("UTC")));
        rota.setStatus(StatusEnum.CREATED);

        for(int i = 0;i< rota.getDeliveries().size(); i++) {
            rota.getDeliveries().get(i).setStatus(StatusEnum.CREATED);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(rotaService.save(rota));
    }
}
