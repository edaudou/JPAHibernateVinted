package dao;
import models.Contraoferta;

public class ContraofertaDAOImpl extends Dao<Contraoferta,Integer>{
    @Override
    public Contraoferta find(Integer id) {
        Contraoferta contraoferta= new Contraoferta();
        return contraoferta;
    }
}
