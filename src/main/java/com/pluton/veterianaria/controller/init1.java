package com.pluton.veterianaria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class init1 {
    @GetMapping("/hola")
    public String saludar() {
        return "Si lo puedes imaginar lo puedes programar. ATS ❤";
    }
}
