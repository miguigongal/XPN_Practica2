package com.API_Planificacion_Recursos_P2.xpn.model.services.impl;

import javax.management.InstanceNotFoundException;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API_Planificacion_Recursos_P2.xpn.model.common.exceptions.NegativeStockException;
import com.API_Planificacion_Recursos_P2.xpn.model.entities.almacen;
import com.API_Planificacion_Recursos_P2.xpn.model.entities.stock;
import com.API_Planificacion_Recursos_P2.xpn.model.services.stockService;
import com.API_Planificacion_Recursos_P2.xpn.model.entities.dao.stockDao;
import com.API_Planificacion_Recursos_P2.xpn.model.entities.dao.almacenDao;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class stockServiceImpl implements stockService{

    @Autowired
    stockDao stockDao;

    @Autowired
    almacenDao almacenDao;

    private void checkNewStockValue(int newStock) throws NegativeStockException{
        if (newStock < 0){
            throw new NegativeStockException();
        }
    }

    @Override
    public Integer getCurrentStock(Long muebleId, String almacenName) throws InstanceNotFoundException{        
        stock foundStock = stockDao.findByMuebleIdAndAlmacenNombre(muebleId, almacenName).get();
        return foundStock.getActualStock();
    }

    @Override
    public Integer getMaxStock(Long muebleId, String almacenName) throws InstanceNotFoundException{
        stock foundStock = stockDao.findByMuebleIdAndAlmacenNombre(muebleId, almacenName).get();
        return foundStock.getMaxStock();
    }

    @Override
    public Integer getMinStock(Long muebleId, String almacenName) throws InstanceNotFoundException{
        stock foundStock = stockDao.findByMuebleIdAndAlmacenNombre(muebleId, almacenName).get();
        return foundStock.getMinStock();
    }
    //Almacen pasarle un nombre y buscar por nombre el id
    @Override
    public void updateStock(Long muebleId, String almacenName, int newStock) throws NegativeStockException{
        stock foundStock = stockDao.findByMuebleIdAndAlmacenNombre(muebleId, almacenName).get();
        checkNewStockValue(newStock);
        foundStock.setActualStock(newStock);

        stockDao.save(foundStock);
    }

    /*
    @Override
    public almacen recommendAlmacen() {
        List<almacen> allAlmacenes = almacenDao.findAll();
        
        Random random = new Random();
        int randomIndex = random.nextInt(allAlmacenes.size());
        almacen randomAlmacen = allAlmacenes.get(randomIndex);

        return randomAlmacen;
    }*/
    @Override
    public almacen recommendAlmacen() {
        List<almacen> allAlmacenes = almacenDao.findAll();
    
        Random random = new Random();
        almacen randomAlmacen = null;
    
        // Asegúrate de que el almacén con id = 1 no sea seleccionado
        while (randomAlmacen == null || randomAlmacen.getId() == 1) {
            int randomIndex = random.nextInt(allAlmacenes.size());
            randomAlmacen = allAlmacenes.get(randomIndex);
        }

        return randomAlmacen;
    }
}
