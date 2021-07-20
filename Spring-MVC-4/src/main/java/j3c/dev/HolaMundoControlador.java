package j3c.dev;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

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
	
	@RequestMapping("/procesarFormMensaje")
	public String textoAMayuscula(HttpServletRequest request, Model modelo) {
		String nombre = request.getParameter("nombre");
		nombre = nombre.toUpperCase();
		String resultado = "Hola " + nombre + "!";
		modelo.addAttribute("mensaje", resultado);
		return("hello-page");
	}
}
