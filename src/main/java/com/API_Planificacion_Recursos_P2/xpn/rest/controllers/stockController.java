package com.API_Planificacion_Recursos_P2.xpn.rest.controllers;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.API_Planificacion_Recursos_P2.xpn.model.common.exceptions.NegativeStockException;
import com.API_Planificacion_Recursos_P2.xpn.model.entities.almacen;
import com.API_Planificacion_Recursos_P2.xpn.model.services.stockService;
import com.API_Planificacion_Recursos_P2.xpn.rest.dtos.almacenDto;
import com.API_Planificacion_Recursos_P2.xpn.rest.dtos.updateParamsDto;
import com.API_Planificacion_Recursos_P2.xpn.rest.conversors.almacenConversor;

@RestController
@RequestMapping("/api/stock")
public class stockController {

    @Autowired 
    stockService stockService;

    @GetMapping("/actual")
    public Integer getCurrentStock(@Validated @RequestParam Long muebleId, @RequestParam String almacenName) throws InstanceNotFoundException{
        int currentStock = stockService.getCurrentStock(muebleId, almacenName);
        System.out.println(currentStock);
        return currentStock;
    }

    @GetMapping("/max")
    public Integer getMaximumStock(@Validated @RequestParam Long muebleId, @RequestParam String almacenName) throws InstanceNotFoundException{
        int maximumStock = stockService.getMaxStock(muebleId, almacenName);
        return maximumStock;
    }
  
    @GetMapping("/min")
    public Integer getMinimumStock(@Validated @RequestParam Long muebleId, @RequestParam String almacenName) throws InstanceNotFoundException{
        int minimumStock = stockService.getMinStock(muebleId, almacenName);
        return minimumStock;
    }

    @PostMapping("/updateStock")
    public void updateStock(@RequestBody updateParamsDto paramsDto) throws NegativeStockException{
        stockService.updateStock(paramsDto.getIdMueble(), paramsDto.getNombreAlmacen(), paramsDto.getActualStock());        
    }

    @GetMapping("/recommend")
    public almacenDto recommendAlmacen(){
        almacen almacen = stockService.recommendAlmacen();
        return almacenConversor.toAlmacenDto(almacen);
    }


}
