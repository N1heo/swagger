package kg.edu.alatoo.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
		title = "Swagger Project",
		version = "1.0.0",
		description = "Web Spring Project Using Swagger",
		termsOfService = "NazarApsatarov",
		contact = @Contact(
			name = "Nazar",
			email = "napsatarov@gmail.com"
		),
		license = @License(
			name = "license",
			url = "NazarApsatarov"
		)
	)
)
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}

