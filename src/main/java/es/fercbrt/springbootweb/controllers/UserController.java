package es.fercbrt.springbootweb.controllers;

import es.fercbrt.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Fernando", "Calvino");
        model.addAttribute("title", "User Details");
        model.addAttribute("user", user);
        return "details";
    }
}
