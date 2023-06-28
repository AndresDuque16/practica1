package co.netec.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.netec.app.modelo.Alumno;

@Controller
public class HomeController {
	
	
	@GetMapping("/")
	public String inicio(Model modelo ) {
	
		Alumno alumnoUno  = new Alumno("Angelo", 33, "Ingeniero", "Lo de siempre");
		modelo.addAttribute("alum", alumnoUno);
		return "inicio";
		
	}
	
}
