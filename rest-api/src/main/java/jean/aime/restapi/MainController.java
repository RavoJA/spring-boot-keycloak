package jean.aime.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/beers")
    public String beers() {
        return "beers";
    }
}
