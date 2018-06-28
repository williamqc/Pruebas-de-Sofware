/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.kahoot.servis;

import java.util.List;
import pe.edu.upeu.kahoot.model.Usuario;

/**
 *
 * @author Alumno
 */
public interface UsuarioService {
    public List<Usuario> listarEntidad();
    public Usuario buscarEntidad(int id);
    public void guardarEntidad(Usuario usuario);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Usuario usuario);
    public List<Usuario> listarPorNombre(String nombre);
    public Usuario loginSistema(String usuario, String clave);    
}
