package at.refugeescode.jack_sparrow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class JackSparrow {

    @Autowired
    private RestTemplate restTemplate;
    private String treasure;

    public String getTreasure() {
        String clue = getClueAboutTheDutchman(restTemplate);
        String result = followClueToTheDutchman(clue, restTemplate);
        this.setTreasure(result);
        return treasure;
    }

    private void setTreasure(String treasure) {
        this.treasure = treasure;
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
