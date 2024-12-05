package com.API_Planificacion_Recursos_P2.xpn.rest.conversors;

import com.API_Planificacion_Recursos_P2.xpn.model.entities.almacen;
import com.API_Planificacion_Recursos_P2.xpn.rest.dtos.almacenDto;

public class almacenConversor {

    public static almacenDto toAlmacenDto(almacen almacen){
        return new almacenDto(almacen.getId(), almacen.getNombre());
    }
    
}
