package com.API_Planificacion_Recursos_P2.xpn.model.entities.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API_Planificacion_Recursos_P2.xpn.model.entities.stock;

public interface stockDao extends JpaRepository<stock, Long>{

    Optional<stock> findByMuebleIdAndAlmacenId(Long muebleId, Long almacenId);
    
}
