package at.refugeescode.mp7_pirates_of_the_code_bean.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TiaDalma {

    @GetMapping("/dutchman/location")
    public String reply() {
        return "http://localhost:9053/deadmanschest";
    }

}
