package es.fercbrt.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String index() {
        /*
            Differences between forward and redirect:
            - forward: the request is forwarded to another URL on the server-side. The URL in the browser remains the same.
            - redirect: the request is redirected to another URL on the client-side. The URL in the browser changes.
         */
        return "forward:/list";
        //return "redirect:/list";
    }
}
