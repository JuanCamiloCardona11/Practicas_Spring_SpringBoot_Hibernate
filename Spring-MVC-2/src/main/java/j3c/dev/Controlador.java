package j3c.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
	@RequestMapping("/")
	public String mostrarPaginaPrincipal() {
		return("main-menu");
	}
}
