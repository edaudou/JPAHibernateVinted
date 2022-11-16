package dao;
import dao.Dao;
import models.Oferta;

public class OfertaDAOImpl extends Dao<Oferta,Integer> {

    @Override
    public Oferta find(Integer id) {
        Oferta oferta= (Oferta) em.find(Oferta.class,id);
        return oferta;
    }
}
