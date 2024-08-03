package es.fercbrt.springbootweb.controllers;

import es.fercbrt.springbootweb.models.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hello world!", name = "message") String message) {
        return new ParamDto(message, null);
    }

    @GetMapping("/bar")
    public ParamDto bar(@RequestParam(required = false, defaultValue = "Hello world!", name = "text") String text, @RequestParam(required = false, defaultValue = "42", name = "code") int code) {
        return new ParamDto(text, code);
    }
}
