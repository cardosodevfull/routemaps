package com.api.routemaps.repository;

import com.api.routemaps.entity.Rota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RotaRepository extends JpaRepository<Rota, UUID> {
}
