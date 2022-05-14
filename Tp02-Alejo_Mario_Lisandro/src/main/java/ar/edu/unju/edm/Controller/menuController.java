package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class menuController {
	@GetMapping ("/menu")
	public String obtenerMenu() {
		return("Menu");
	}
}
