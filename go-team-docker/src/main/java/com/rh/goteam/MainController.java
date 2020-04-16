package com.rh.goteam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = {"/"})
    public String greet() {
        return "And this is an example of a simple REST API created using S2I with Docker file\n";
    }

}
