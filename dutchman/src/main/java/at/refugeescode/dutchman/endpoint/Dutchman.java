package at.refugeescode.dutchman.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Dutchman {

    @GetMapping("/deadmanschest")
    public String password() {
        return "Found the treasure!";
    }

}
