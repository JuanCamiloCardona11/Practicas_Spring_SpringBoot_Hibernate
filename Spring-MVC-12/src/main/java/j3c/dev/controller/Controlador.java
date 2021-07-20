package j3c.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import j3c.dev.dominio.Estudiante;

@Controller
@RequestMapping("/estudiante")
public class Controlador {
	
	@RequestMapping("/")
	public String motrarPagInicio() {
		return("pagina-principal");
	}
	
	@RequestMapping("/mostrarForm")
	public String mostrarPaginaInicio(Model modelo) {
		modelo.addAttribute("estudiante", new Estudiante());
		return("pagina-form");
	}
	
	@RequestMapping("/procesarForm")
	public String procesarForm(@ModelAttribute("estudiante") Estudiante estudiante) {
		System.out.println("Informacion el estudiante: " + estudiante);
		return("confirmacion-estudiante");
	}
	
	
}
