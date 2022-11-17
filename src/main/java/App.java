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
        Producto producto2= new Producto(null,"ShoxNL","Zapatillas","44","Muy Bueno","Nike","El zapato esta sin estrenar",100,pedidoDAO.find(3),usuarioDAO.find(1));
        Pedido pedido= new Pedido(null,"A9949",productoDAO.find(1));
        Date date= new Date();
        Oferta oferta= new Oferta(null,70.0, date,"Oferta1",usuarioDAO.find(1),productoDAO.find(2));
        Contraoferta contraoferta= new Contraoferta(null,68,date,"Contraoferta1",ofertaDAO.find(2),usuarioDAO.find(1));

        //Creacion datos
    //  usuarioDAO.create(usuario);
       productoDAO.create(producto2);
 //       pedidoDAO.create(pedido);
  //     ofertaDAO.create(oferta);
      // contraofertaDAO.create(contraoferta);
        System.out.println(productoDAO.ordenarProductosporTalla("44"));
    }
}
