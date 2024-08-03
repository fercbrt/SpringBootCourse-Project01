package es.fercbrt.springbootweb.controllers;

import es.fercbrt.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Fernando", "Calvino", "user@example.com");
        model.addAttribute("title", "User Details");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = new ArrayList<>(
                List.of(
                        new User("Fernando", "Calvino", "user@example.com"),
                        new User("John", "Doe", "user@example.com"),
                        new User("Jane", "Doe", "user@example.com")
                )
        );
        model.addAttribute("title", "User List");
        model.addAttribute("users", users);
        return "list";
    }
}
