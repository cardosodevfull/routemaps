package com.api.routemaps.controller;

import com.api.routemaps.dto.RotaDto;
import com.api.routemaps.entity.Rota;
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

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> save(@RequestBody @Valid RotaDto rotaDto) {
        var rota = new Rota();
        //coverter o dto em entity
        BeanUtils.copyProperties(rotaDto, rota);
        rota.setCreatedAt(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(rotaService.save(rota));
    }
}
