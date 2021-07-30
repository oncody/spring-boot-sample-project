import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This class is a controller class with HTTP REST endpoints
@EnableAutoConfiguration // Tell spring to handle configuration
public class Example {

    @RequestMapping("/") // Register the / route with this method
    public String home() {
        return "Hello from spring boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args); // Spring will bootstrap our application before running
    }
}