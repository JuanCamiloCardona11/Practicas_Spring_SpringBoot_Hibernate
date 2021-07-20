package j3c.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaMundoControlador {

	@RequestMapping("/mostrarForm")
	public String mostrarPagina() {
		return("form-page");
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarForm() {
		return("hello-page");
	}
}
