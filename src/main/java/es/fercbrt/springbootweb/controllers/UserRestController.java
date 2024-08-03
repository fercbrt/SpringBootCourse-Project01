package es.fercbrt.springbootweb.controllers;

import es.fercbrt.springbootweb.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UserRestController {
    @GetMapping("/details")
    public User details() {
        return new User("Fernando", "Calvino");
    }
}
