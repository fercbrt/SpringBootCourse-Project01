package es.fercbrt.springbootweb.controllers;

import es.fercbrt.springbootweb.models.User;
import es.fercbrt.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserRestController {
    @GetMapping("/details")
    public UserDto details() {
        User user = new User("Fernando", "Calvino");
        return new UserDto("User Details", user);
    }

    @GetMapping("/list")
    public List<User> list() {
        return List.of(new User("Fernando", "Calvino"),
                new User("John", "Doe"),
                new User("Jane", "Doe"));
    }
}
