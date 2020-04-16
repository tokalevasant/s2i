package com.rh.hellojava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = {"/"})
    public String greet() {

        return "Hello Everyone. This is an example of a simple Java REST API created using S2I with NO Docker file";
    }

}
