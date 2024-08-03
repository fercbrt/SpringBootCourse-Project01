package es.fercbrt.springbootweb.controllers;

import es.fercbrt.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
        model.addAttribute("title", "User List");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> users() {
        return List.of(
                new User("Fernando", "Calvino", "user@example.com"),
                new User("John", "Doe", "user@example.com"),
                new User("Jane", "Doe", "user@example.com")
        );
        }
}
