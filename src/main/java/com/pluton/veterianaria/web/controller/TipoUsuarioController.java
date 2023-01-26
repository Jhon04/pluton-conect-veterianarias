package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.TipoUsuarioPojo;
import com.pluton.veterianaria.domain.services.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipousuario")
public class TipoUsuarioController {
	@Autowired
	private TipoUsuarioService tipoUsuarioService;

	@GetMapping("all")
	public List<TipoUsuarioPojo> getAll(){
		return tipoUsuarioService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<TipoUsuarioPojo> getTipoUsuario(@PathVariable("id") int idTipoUsuario){
		return tipoUsuarioService.getTipoUsuarioPojo(idTipoUsuario);
	}

	@PostMapping("/save")
	public TipoUsuarioPojo save(@RequestBody TipoUsuarioPojo tipoUsuarioPojo){
		return tipoUsuarioService.save(tipoUsuarioPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idTipoUsuario){
		return tipoUsuarioService.delete(idTipoUsuario);
	}

}