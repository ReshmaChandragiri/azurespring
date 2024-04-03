package AzureFunction.AzureFunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzureFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureFunctionApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hi from spring boot application!!";
	}

}
