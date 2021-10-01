package com.example.miriam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorHola {

    @RequestMapping("/hola")
    public String hola(){
        return "hola mundo";
    }
}
