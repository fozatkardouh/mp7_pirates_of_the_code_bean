package at.refugeescode.jack_sparrow.initializer;

import at.refugeescode.jack_sparrow.model.JackSparrow;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Configuration
public class StartPoint {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ApplicationRunner starter(JackSparrow jackSparrow, RestTemplate restTemplate) {
        return args -> {
            String clue = getClueAboutTheDutchman(restTemplate);
            String result = followClueToTheDutchman(clue, restTemplate);
            jackSparrow.setTreasure(result);

            System.out.println(jackSparrow.getTreasure());
        };
    }

    private String followClueToTheDutchman(String clue, RestTemplate restTemplate) {
        ResponseEntity<String> response = restTemplate.getForEntity(clue, String.class);
        return response.getBody();
    }

    private String getClueAboutTheDutchman(RestTemplate restTemplate) {
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:9052/dutchman/location", String.class);
        return response.getBody();
    }

}
