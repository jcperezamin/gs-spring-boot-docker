package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Our products have been impressing millions of families for more than 140 years, thanks to their superior, innovative technology and legendary long life.";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
