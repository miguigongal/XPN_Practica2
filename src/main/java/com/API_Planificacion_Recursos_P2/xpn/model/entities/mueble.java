package com.API_Planificacion_Recursos_P2.xpn.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "MUEBLE")
public class mueble {

    //The id
    private Long id;
    //The name
    private String nombre;

    public mueble(){
    }

    public mueble(String nombre){
        this.nombre = nombre;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
