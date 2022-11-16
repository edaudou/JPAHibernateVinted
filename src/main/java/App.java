import dao.*;
import models.*;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        //Crear dao
        OfertaDAOImpl ofertaDAO= new OfertaDAOImpl();
        PedidoDAOImpl pedidoDAO= new PedidoDAOImpl();
        ProductoDAOImpl productoDAO= new ProductoDAOImpl();
        UsuarioDAOImpl usuarioDAO= new UsuarioDAOImpl();
        ContraofertaDAOImpl contraofertaDAO= new ContraofertaDAOImpl();

        //Crear entidades
        Usuario usuario= new Usuario(null,"Eduardo Castillo",4.2,"Abalos","Skpap2",null,null,null);
        Producto producto= new Producto(null,"ShoxR4","Zapatillas","44","Muy Bueno","Nike","El zapato esta sin estrenar",60.4,null,usuarioDAO.find(1));
        Pedido pedido= new Pedido(null,"A9949",producto);
        Date date= new Date();
        Oferta oferta= new Oferta(null,70.0, date,"Oferta1",usuario,producto);
        Contraoferta contraoferta= new Contraoferta(null,68,date,"Contraoferta1",oferta,usuario);

        //Creacion datos
//      usuarioDAO.create(usuario);
        productoDAO.create(producto);
    }
}
