package dao;

import models.Producto;

public class ProductoDAOImpl extends Dao<Producto, Integer> {
    @Override
    public Producto find(Integer id) {
        Producto producto= (Producto) em.find(Producto.class, id);
        return producto;
    }
    //Los productos de un usuario ordenados por talla
    public Producto ordenarProductosporTalla(String talla){

        return null;
    }
}
