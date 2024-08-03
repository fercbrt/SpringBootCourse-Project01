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
        User user = new User("Fernando", "Calvino", "fernandoCalvino@example.com");
        return new UserDto("User Details", user);
    }

    @GetMapping("/list")
    public List<UserDto> list() {
        return List.of(
                new UserDto("User Details", new User("Fernando", "Calvino", "fernandocalvino@example.com")),
                new UserDto("User Details", new User("John", "Doe", "johndoe@example.com")),
                new UserDto("User Details", new User("Jane", "Doe", "janedhoe@example.com"))
        );
    }
}
