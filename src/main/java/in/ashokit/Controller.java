package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String welcomeMsg() {
		String msg = "Welcome to Git hub";
		return msg;
	}

}
