package com.API_Planificacion_Recursos_P2.xpn.model.services;

import javax.management.InstanceNotFoundException;

import com.API_Planificacion_Recursos_P2.xpn.model.common.exceptions.NegativeStockException;
import com.API_Planificacion_Recursos_P2.xpn.model.entities.almacen;


public interface stockService {

    //Obtener stock actual    
    Integer getCurrentStock(Long muebleId, String almacenName) throws InstanceNotFoundException;

    //Obtener stock máximo
    Integer getMaxStock(Long muebleId, String almacenName) throws InstanceNotFoundException;

    //Obtener stock mínimo
    Integer getMinStock(Long muebleId, String almacenName) throws InstanceNotFoundException;

    //Actualizar stock
    void updateStock(Long muebleId, String almacenName, int newStock) throws NegativeStockException;

    //Devolver almacen random
    almacen recommendAlmacen();
}
