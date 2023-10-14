package Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping(value="/get")
	public String hi() {
		return "Vanthuruchu da Mavanae";
	}

}
