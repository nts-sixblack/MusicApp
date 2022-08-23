package app.music.musicapp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class MusicAPpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicAPpApplication.class, args);
    }

}
