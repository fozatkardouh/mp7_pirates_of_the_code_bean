package at.refugeescode.jack_sparrow.initializer;

import at.refugeescode.jack_sparrow.controller.JackSparrow;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StartPoint {

    @Bean
    public ApplicationRunner starter() {
        JackSparrow jackSparrow = new JackSparrow();
        return args -> System.out.println(jackSparrow.getTreasure());
    }

}
