package dao;

import models.Producto;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class ProductoDAOImpl extends Dao<Producto, Integer> {
    @Override
    public Producto find(Integer id) {
        Producto producto= (Producto) em.find(Producto.class, id);
        return producto;
    }
    //Los productos de un usuario ordenados por talla
    public List<Producto> ordenarProductosporTalla(String talla){
        EntityTransaction entityTransaction=em.getTransaction();
        entityTransaction.begin();
        String query="SELECT p FROM Producto p where p.talla like :talla";
        Query query1= em.createQuery(query);
        query1.setParameter("talla",talla);
        List<Producto> productoList= query1.getResultList();
        return productoList;
    }
}
