/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.kahoot.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.kahoot.SysDataAccess;
import pe.edu.upeu.kahoot.model.Usuario;

/**
 *
 * @author Alumno
 */
@Repository
public class UsuarioDaoImpl extends SysDataAccess<Integer, Usuario> implements UsuarioDao{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Usuario> listarEntidad() { return getListAll();}

    @Override
    public Usuario buscarEntidad(int id) {return getById(id);}

    @Override
    public void guardarEntidad(Usuario usuario) { savev(usuario);}

    @Override
    public void eliminarEntidad(int id) { delete(id);  }

    @Override
    public void modificarEntidad(Usuario usuario) { update(usuario);   }

    @Override
    public List<Usuario> listarPorNombre(String nombre) {
        return (List<Usuario>)sessionFactory.getCurrentSession()
                .createQuery("SELECT a FROM Usuario a WHERE a.idPersona.nombre like ?")
                .setParameter(0, "%"+nombre+"%")
                .list();
    }

    @Override
    public Usuario loginSistema(String usuario, String clave) {
        return (Usuario)sessionFactory.getCurrentSession()
                .createQuery("SELECT a FROM Usuario a WHERE a.idPersona.usuario=? and a.idPersona.clave=?")
                .setParameter(0, usuario)
                .setParameter(1, clave)
                .uniqueResult();        
    }
    
    
    
}
