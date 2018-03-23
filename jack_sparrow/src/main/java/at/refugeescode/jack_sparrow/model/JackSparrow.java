package at.refugeescode.jack_sparrow.model;

import org.springframework.stereotype.Component;

@Component
public class JackSparrow {

    private String treasure;

    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
    }
}
