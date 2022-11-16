package dao;

import models.Pedido;

public class PedidoDAOImpl extends  Dao<Pedido,Integer> {
    @Override
    public Pedido find(Integer id) {
        Pedido pedido = (Pedido) em.find(Pedido.class,id);
        return pedido;
    }
}