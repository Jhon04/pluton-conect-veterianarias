package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.TipoMascotaPojo;
import com.pluton.veterianaria.domain.services.TipoMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipomascota")
public class TipoMascotaController {
	@Autowired
	private TipoMascotaService tipoMascotaService;

	@GetMapping("all")
	public List<TipoMascotaPojo> getAll(){
		return tipoMascotaService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<TipoMascotaPojo> getTipoMascota(@PathVariable("id") int idTipoMascota){
		return tipoMascotaService.getTipoMascotaPojo(idTipoMascota);
	}

	@PostMapping("/save")
	public TipoMascotaPojo save(@RequestBody TipoMascotaPojo tipoMascotaPojo){
		return tipoMascotaService.save(tipoMascotaPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idTipoMascota){
		return tipoMascotaService.delete(idTipoMascota);
	}

}