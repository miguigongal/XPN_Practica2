package com.API_Planificacion_Recursos_P2.xpn.rest.dtos;

public class updateParamsDto {

    private Long idMueble;
    private Long idAlmacen;
    private int actualStock;

    public updateParamsDto(){
    }

    public updateParamsDto(Long idMueble, Long idAlmacen, int actualStock){
        this.idMueble = idMueble;
        this.idAlmacen = idAlmacen;
        this.actualStock = actualStock;
    }

    public Long getIdMueble(){
        return idMueble;
    }

    public void setIdMueble(Long idMueble){
        this.idMueble = idMueble;
    }

    public Long getIdAlmacen(){
        return idAlmacen;
    }

    public void setIdAlmacen(Long idAlmacen){
        this.idAlmacen = idAlmacen;
    }

    public int getActualStock(){
        return actualStock;
    }

    public void setActualStock(int actualStock){
        this.actualStock = actualStock;
    }
    
}
