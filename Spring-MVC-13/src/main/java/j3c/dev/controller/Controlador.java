package j3c.dev.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import j3c.dev.dominio.Cliente;

@Controller
@RequestMapping("/cliente")
public class Controlador {
	
	@RequestMapping("/")
	public String motrarPagInicio() {
		return("pagina-principal");
	}
	
	@RequestMapping("/mostrarForm")
	public String mostrarFormIngreso(Model modelo) {
		modelo.addAttribute("estudiante", new Cliente());
		return("form-cliente");
	}
	
	@RequestMapping("/procesarForm")
	public String procesarForm(
			@Valid 
			@ModelAttribute("cliente") Cliente cliente,
			BindingResult bindingResult) {
		System.out.println("Informacion del cliente: " + cliente);
		if(bindingResult.hasErrors()) {
			return("form-cliente");
		} else {
			return("confirmacion-cliente");
		}
	}
}
