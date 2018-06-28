/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.kahoot.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.kahoot.model.Usuario;
import pe.edu.upeu.kahoot.servis.UsuarioService;

/**
 *
 * @author Alumno
 */

@Controller
public class IndexController {

    
@Autowired
UsuarioService servicioUser;


@GetMapping("/")
public ModelAndView paginaPrincipal(Model model){
    for (Usuario user : servicioUser.listarEntidad()) {
        System.out.println("VER:"+user.getIdPersona().getNombre());
    }
    return new ModelAndView("login");
}
    
}
