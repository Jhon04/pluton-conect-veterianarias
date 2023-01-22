package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.ComentarioPojo;
import com.pluton.veterianaria.domain.services.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("/all")
    public List<ComentarioPojo> getAll(){
        return comentarioService.getAll();
    }
}
