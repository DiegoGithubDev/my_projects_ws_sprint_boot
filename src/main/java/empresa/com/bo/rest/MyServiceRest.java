package empresa.com.bo.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServiceRest {

	@GetMapping("/nombre")
	public String nombreSitio() {
		return "this is my first web site";
	}
	
	@GetMapping("/descripcion")
	public String descripcionSitio() {
		return "this is my DESCRIPTION OF first web site";
	}
}
