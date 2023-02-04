package com.api.routemaps.service;

import com.api.routemaps.entity.Rota;
import com.api.routemaps.repository.RotaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RotaService {

    @Autowired
    private RotaRepository rotaRepository;

    @Transactional
    public Object save(Rota rota) {
        return rotaRepository.save(rota);
    }
}
