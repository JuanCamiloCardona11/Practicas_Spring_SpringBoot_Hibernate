package j3c.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ControladorPrincipal")
public class Controlador {
	
	@RequestMapping("/")
	public String mostrarPaginaPrincipal() {
		return("main-menu");
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormVersion2() {
		return("hello-page");
	}
}
