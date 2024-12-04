package com.API_Planificacion_Recursos_P2.xpn.model.entities;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "STOCK")
public class stock implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idMueble")
    private mueble mueble;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idAlmacen")
    private almacen almacen;
    @Column(name="max_stock")
    private int maxStock;
    @Column(name="min_stock")
    private int minStock;
    @Column(name="actual_stock")
    private int actualStock;

    public stock(){        
    }

    public stock(mueble mueble, almacen almacen, int maxStock, int minStock, int actualStock){
        this.mueble = mueble;
        this.almacen = almacen;
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


    public mueble getMueble(){
        return mueble;
    }

    public void setMueble(mueble mueble){
        this.mueble = mueble;
    }


    public almacen getAlmacen(){
        return almacen;
    }

    public void setAlmacen(almacen almacen){
        this.almacen = almacen;
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
