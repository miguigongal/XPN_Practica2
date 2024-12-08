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
import com.API_Planificacion_Recursos_P2.xpn.rest.dtos.updateParamsDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/stock")
@Tag(name = "Stock Controller", description = "Controlador para gestionar el stock de los muebles en almacenes")
public class stockController {

    @Autowired 
    stockService stockService;


    @Operation(summary = "getCurrentStock", description = "Devuelve el stock actual de un mueble en un almacén específico.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Stock actual devuelto exitosamente"),
        @ApiResponse(responseCode = "404", description = "No se encontró el mueble o el almacén")
    })
    @GetMapping("/actual")
    public Integer getCurrentStock(@Validated @RequestParam Long muebleId, @RequestParam String almacenName) throws InstanceNotFoundException{
        int currentStock = stockService.getCurrentStock(muebleId, almacenName);
        System.out.println(almacenName);
        System.out.println(currentStock);
        System.out.println("actual");
        return currentStock;
    }


    @Operation(summary = "getMaximumStock", description = "Devuelve el stock máximo de un mueble en un almacén")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Stock máximo devuelto exitosamente"),
        @ApiResponse(responseCode = "404", description = "No se encontró el mueble o el almacén")
    })
    @GetMapping("/max")
    public Integer getMaximumStock(@Validated @RequestParam Long muebleId, @RequestParam String almacenName) throws InstanceNotFoundException{
        int maximumStock = stockService.getMaxStock(muebleId, almacenName);
        System.out.println("max");
        return maximumStock;
    }

    @Operation(summary = "getMinimumStock", description = "Devuelve el stock mínimo de un mueble en un almacén")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Stock mínimo devuelto exitosamente"),
        @ApiResponse(responseCode = "404", description = "No se encontró el mueble o el almacén")
    })
    @GetMapping("/min")
    public Integer getMinimumStock(@Validated @RequestParam Long muebleId, @RequestParam String almacenName) throws InstanceNotFoundException{
        int minimumStock = stockService.getMinStock(muebleId, almacenName);
        System.out.println("min");
        return minimumStock;
    }


    @Operation(summary = "updateStock", description = "Actualiza el stock de un mueble en un almacén")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Stock actualizado exitosamente"),
        @ApiResponse(responseCode = "400", description = "Stock negativo no permitido")
    })
    @PostMapping("/updateStock")
    public void updateStock(@RequestBody updateParamsDto paramsDto) throws NegativeStockException{
        stockService.updateStock(paramsDto.getIdMueble(), paramsDto.getNombreAlmacen(), paramsDto.getActualStock());
        System.out.println("stock"+ paramsDto.getActualStock());
        System.out.println("id mueble "+ paramsDto.getIdMueble());
        System.out.println("nombre almacen " + paramsDto.getNombreAlmacen());
        
    }

    @Operation(summary = "recommendAlmacen", description = "Recomienda un almacén adecuado para el mueble.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Recomendación de almacén exitosa")
    })
    @GetMapping("/recommend")
    public String recommendAlmacen(){
        almacen almacen = stockService.recommendAlmacen();
        System.out.println("recommend:" + almacen.getNombre());

        return almacen.getNombre();
    }

}
