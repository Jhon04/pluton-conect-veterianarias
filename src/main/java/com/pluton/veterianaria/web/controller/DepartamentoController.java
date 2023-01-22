package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.DepartamentoPojo;
import com.pluton.veterianaria.domain.services.ClientService;
import com.pluton.veterianaria.domain.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping("/all")
    public List<DepartamentoPojo> getAll(){
        return departamentoService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<DepartamentoPojo> getDepartamento(@PathVariable("id") int departamentoId){
        return departamentoService.getDepartamento(departamentoId);
    }

    @PostMapping("/save")
    public DepartamentoPojo save(@RequestBody DepartamentoPojo departamentoPojo){
        return departamentoService.save(departamentoPojo);
    }

    /*@PutMapping("/update")
    public DepartamentoPojo update(@RequestBody DepartamentoPojo departamentoPojo){
        return departamentoService.update(departamentoPojo);
    }*/

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id}") int departamentoId){
        return departamentoService.delete(departamentoId);
    }
}
