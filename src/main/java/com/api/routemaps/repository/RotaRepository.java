package com.api.routemaps.repository;

import com.api.routemaps.entity.Rota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RotaRepository extends JpaRepository<Rota, UUID> {
}
