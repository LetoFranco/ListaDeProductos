package com.example.francoleto.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by francoleto on 14/5/16.
 */
public class ProductoFactory {
    private static ProductoFactory instance;

    private List<Producto> productos;

    public static ProductoFactory getInstance(){
        if(instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }

    private ProductoFactory(){ productos = new ArrayList<>();}

    public void agregarProducto(Producto producto){productos.add(producto);}

    public List<Producto> obtenerProductos(){return productos;}
}
