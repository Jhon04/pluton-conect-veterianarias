package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.TipoServicioPojo;
import com.pluton.veterianaria.domain.services.TipoServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tiposervicio")
public class TipoServicioController {
	@Autowired
	private TipoServicioService tipoServicioService;

	@GetMapping("all")
	public List<TipoServicioPojo> getAll(){
		return tipoServicioService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<TipoServicioPojo> getTipoServicio(@PathVariable("id") int idTipoServicio){
		return tipoServicioService.getTipoServicioPojo(idTipoServicio);
	}

	@PostMapping("/save")
	public TipoServicioPojo save(@RequestBody TipoServicioPojo tipoServicioPojo){
		return tipoServicioService.save(tipoServicioPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idTipoServicio){
		return tipoServicioService.delete(idTipoServicio);
	}

}