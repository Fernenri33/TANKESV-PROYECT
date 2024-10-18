package com.app.tankesv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.io.File;
import java.io.IOException;


@Controller
public class FormsController {

    @GetMapping("/AdminDeUsuario")
    public String mostrarformAdministracionDeUsuario(){
        return "formularios/formAdministracionDeUsuario";
    }

    @GetMapping("/Comentario")
    public String mostrarformComentarios(){
        return "formularios/formComentarios";
    }

    @GetMapping("/CreacionPerfil")
    public String mostrarformCreacionDePerfil(){
        return "formularios/formCreacionDePerfil";
    }

    @GetMapping("/CrearProyecto")
    public String mostrarformCreacionDeProyectos(){
        return "formularios/formCreacionDeProyectos";
    }
    
    @GetMapping("/GestionCatalogo")
    public String mostrarformGestionCatalogos(){
        return "formularios/formGestionCatalogos";
    }

    @GetMapping("/Login")
    public String mostrarLogin(){
        return "formularios/formLogin";
    }

    @GetMapping("/Pago")
    public String mostrarFormPagoFacturacion(){
        return "formularios/FormPagoFacturacion";
    }

    @GetMapping("/RecuperarContrasena")
    public String mostrarFormRecuperacionDeContraseña(){
        return "formularios/FormRecuperacionDeContraseña";
    }

    @GetMapping("/NuevoCliente")
    public String mostrarformRegistroClientes(){
        return "formularios/formRegistroClientes";
    }

    @GetMapping("/NuevoEmprendedor")
    public String mostrarformRegistroEmprendedores(){
        return "formularios/formRegistroEmprendedores";
    }

/*
 * El Controlador ReportarUsuario hasido movido a la carpeta formsController, por favor hacer lo mismo para cada controlador
 * Lo mueven A UNA CLASE INDIVIDUAL dentro de la carteta formsController, ahí manejen TODA LA LOGICA de CADA FORMULARIO
 */

    @GetMapping("/ReportarIncidente")
    public String mostrarformReporteIncidentess(){
        return "formularios/formReporteIncidentes";
    }

    @GetMapping("/Reportes")
    public String mostrarformReporteIncidentes(){
        return "formularios/formReportes";
    }
}
