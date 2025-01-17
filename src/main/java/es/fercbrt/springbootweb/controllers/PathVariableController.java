package es.fercbrt.springbootweb.controllers;

import es.fercbrt.springbootweb.models.User;
import es.fercbrt.springbootweb.models.dto.ParamDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("api/var")
public class PathVariableController {

    @Value("${config.name}")
    private String name;
    @Value("${config.code}")
    private Long code;
    @Value("#{ ${config.code} + 100 }")
    private Long codePlus100;
    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valuesMap;

    @Autowired
    private Environment environment;

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        return new ParamDto(message, null);
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id) {
        return Map.of("product", product, "id", id);
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values() {
        return Map.of(
                "name", name,
                "code", code,
                "codePlus100", codePlus100,
                "valuesMap", valuesMap,
                "environment_name", Objects.requireNonNull(environment.getProperty("config.name")));
    }
}
