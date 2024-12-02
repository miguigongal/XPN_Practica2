package com.API_Planificacion_Recursos_P2.xpn.rest.dtos;

import com.API_Planificacion_Recursos_P2.xpn.model.entities.almacen;
import com.API_Planificacion_Recursos_P2.xpn.model.entities.mueble;

public class stockDto {

    private Long id;
    private int maxStock;
    private int minStock;
    private int actualStock;

    public stockDto(){        
    }

    public stockDto(mueble mueble, almacen almacen, int maxStock, int minStock, int actualStock){
        this.maxStock = maxStock;
        this.minStock = minStock;
        this.actualStock = actualStock;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public int getMaxStock(){
        return maxStock;
    }

    public void setMaxStock(int maxStock){
        this.maxStock = maxStock;
    }

    public int getMinStock(){
        return minStock;
    }

    public void setMinStock(int minStock){
        this.minStock = minStock;
    }

    public int getActualStock(){
        return actualStock;
    }

    public void setActualStock(int actualStock){
        this.actualStock = actualStock;
    }        
}
