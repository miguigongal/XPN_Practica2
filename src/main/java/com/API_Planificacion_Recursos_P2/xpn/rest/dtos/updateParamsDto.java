package com.API_Planificacion_Recursos_P2.xpn.rest.dtos;

public class updateParamsDto {

    private Long idMueble;
    private String nombreAlmacen;
    private int actualStock;

    public updateParamsDto(){
    }

    public updateParamsDto(Long idMueble, String nombreAlmacen, int actualStock){
        this.idMueble = idMueble;
        this.nombreAlmacen = nombreAlmacen;
        this.actualStock = actualStock;
    }

    public Long getIdMueble(){
        return idMueble;
    }

    public void setIdMueble(Long idMueble){
        this.idMueble = idMueble;
    }

    public String getNombreAlmacen(){
        return nombreAlmacen;
    }

    public void setNombreAlmacen(String nombreAlmacen){
        this.nombreAlmacen = nombreAlmacen;
    }

    public int getActualStock(){
        return actualStock;
    }

    public void setActualStock(int actualStock){
        this.actualStock = actualStock;
    }
    
}
