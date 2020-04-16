package com.rh.goteam;

import org.springframework.web.bind.annotation.*;

import static org.apache.logging.log4j.util.Strings.isBlank;

@RestController
public class MainController {

    @GetMapping(value = {"/{name}", "/"})
    public String greet(@PathVariable(required = false) String name) {

        if (isBlank(name)) {
            return "Hello Everyone. Great Team Work!!!\n";
        }
        return "Hello " + name;
    }
}
