package com.app.tankesv.controllers.formsControllers;

import com.app.tankesv.model.Empresario;
import com.app.tankesv.model.Usuario;
import com.app.tankesv.repo.EmpresarioRepository;
import com.app.tankesv.repo.UsuarioRepo;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmpresarioController {

    @Autowired
    private EmpresarioRepository empresarioRepository;

    @Autowired
    private UsuarioRepo usuarioRepo;

    @PostMapping ("/Empresario")
    public String crearEmpresario(@ModelAttribute Empresario empresario, Principal principal) {
        
        String email = principal.getName();

        Usuario usuario = usuarioRepo.findByCorreo(email).orElseThrow(() -> new IllegalStateException("El usuario no está registrado como empresario"));
        
        empresario.setUsuario(usuario);

        empresarioRepository.save(empresario);

        return "redirect:/homeUsuario";
 }
}




