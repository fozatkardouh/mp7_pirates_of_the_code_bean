package at.refugeescode.jack_sparrow.initializer;

import at.refugeescode.jack_sparrow.controller.JackSparrow;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class StartPoint {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ApplicationRunner starter(JackSparrow jackSparrow) {
        return args -> System.out.println(jackSparrow.getTreasure());
    }

}
