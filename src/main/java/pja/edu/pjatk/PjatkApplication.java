package pja.edu.pjatk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PjatkApplication {

    public static void main(String[] args) {
        SpringApplication.run(PjatkApplication.class, args);
    }

}
