package com.API_Planificacion_Recursos_P2.xpn.rest.dtos;

public class almacenDto {
    
    private Long id;
    private String nombre;

    public almacenDto(){        
    }

    public almacenDto(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
}
