package dao;

import models.Usuario;

public class UsuarioDAOImpl extends Dao<Usuario,Integer> {
    @Override
    public Usuario find(Integer id) {
        Usuario usuario= (Usuario) em.find(Usuario.class,id);
        return usuario;
    }
    
}
