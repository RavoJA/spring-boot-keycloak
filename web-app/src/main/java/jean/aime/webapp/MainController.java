package jean.aime.webapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.security.RolesAllowed;

@Controller
@Slf4j
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @RolesAllowed("ROLE_app-admin")
    @GetMapping("/beers")
    public String beers(Authentication authentication) {
        log.info("user {}", authentication.getAuthorities());
        log.info("user details {}", authentication.getDetails());
        log.info("user principale {}", authentication.getPrincipal());
        log.info("user name {}", authentication.getName());
        return "beers";
    }


}
