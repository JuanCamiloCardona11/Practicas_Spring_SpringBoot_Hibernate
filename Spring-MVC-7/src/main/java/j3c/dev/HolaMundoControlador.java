package j3c.dev;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/ControladorForm")
public class HolaMundoControlador {

	@RequestMapping("/mostrarForm")
	public String mostrarPagina() {
		return("form-page");
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarForm() {
		return("hello-page");
	}
	
	@RequestMapping("/procesarFormMensaje")
	public String textoAMayuscula(
			@RequestParam("nombre") String nombrePersona,
			Model modelo) {
		nombrePersona = nombrePersona.toUpperCase();
		String resultado = "Hola " + nombrePersona + "!";
		modelo.addAttribute("mensaje", resultado);
		return("hello-page");
	}
}
