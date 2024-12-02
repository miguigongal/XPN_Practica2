package com.API_Planificacion_Recursos_P2.xpn.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "STOCK")
public class stock {

    private Long id;
    private mueble mueble;
    private almacen almacen;
    private int maxStock;
    private int minStock;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idMueble")
    public mueble getMueble(){
        return mueble;
    }

    public void setMueble(mueble mueble){
        this.mueble = mueble;
    }

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "idAlmacen")
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
