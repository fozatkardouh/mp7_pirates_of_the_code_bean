package at.refugeescode.jack_sparrow.initializer;

import at.refugeescode.jack_sparrow.controller.JackSparrow;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class StartPointTest {

    @Autowired
    private JackSparrow jackSparrow;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void starter() {
        String result = jackSparrow.getTreasure();
        System.out.println(result);
    }
}