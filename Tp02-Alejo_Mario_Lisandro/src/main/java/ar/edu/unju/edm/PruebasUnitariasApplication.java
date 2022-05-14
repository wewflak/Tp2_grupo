package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import ar.edu.unju.edm.Controller.alumnoController;
//import ar.edu.unju.edm.Controller.listarAlRevesController;

@SpringBootApplication
@ComponentScan(basePackageClasses=alumnoController.class)
public class PruebasUnitariasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebasUnitariasApplication.class, args);
	}

}
