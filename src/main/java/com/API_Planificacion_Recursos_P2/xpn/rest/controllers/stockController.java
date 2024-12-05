package com.API_Planificacion_Recursos_P2.xpn.rest.controllers;

import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.API_Planificacion_Recursos_P2.xpn.model.common.exceptions.NegativeStockException;
import com.API_Planificacion_Recursos_P2.xpn.model.services.stockService;
import com.API_Planificacion_Recursos_P2.xpn.rest.dtos.updateParamsDto;

@RestController
@RequestMapping("/api/stock")
public class stockController {

    @Autowired 
    stockService stockService;

    @GetMapping("/actual")
    public Integer getCurrentStock(@Validated @RequestParam Long muebleId, @RequestParam Long almacenId) throws InstanceNotFoundException{
        int currentStock = stockService.getCurrentStock(muebleId, almacenId);
        System.out.println(currentStock);
        return currentStock;
    }

    @GetMapping("/max")
    public Integer getMaximumStock(@Validated @RequestParam Long muebleId, @RequestParam Long almacenId) throws InstanceNotFoundException{
        int maximumStock = stockService.getMaxStock(muebleId, almacenId);
        return maximumStock;
    }
    /*
    @GetMapping("/min")
    public Integer getMinimumStock(@Validated @RequestPart("muebleId") Long muebleId, @RequestPart("almacenId") Long almacenId) throws InstanceNotFoundException{
        int minimumStock = stockService.getMinStock(muebleId, almacenId);
        return minimumStock;
    }*/
    @GetMapping("/min")
    public Integer getMinimumStock(@Validated @RequestParam Long muebleId, @RequestParam Long almacenId) throws InstanceNotFoundException{
        int minimumStock = stockService.getMinStock(muebleId, almacenId);
        return minimumStock;
    }

    @PostMapping("/updateStock")
    public void updateStock(@RequestBody updateParamsDto paramsDto) throws NegativeStockException{
        stockService.updateStock(paramsDto.getIdMueble(), paramsDto.getIdAlmacen(), paramsDto.getActualStock());        
    }


}
