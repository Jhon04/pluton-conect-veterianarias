package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.DistritoPojo;
import com.pluton.veterianaria.domain.services.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/distrito")
public class DistritoController {
	@Autowired
	private DistritoService distritoService;

	@GetMapping("all")
	public List<DistritoPojo> getAll(){
		return distritoService.getAll();
	}

	@GetMapping("/{id}")
	public Optional<DistritoPojo> getDistrito(@PathVariable("id") int idDistrito){
		return distritoService.getDistritoPojo(idDistrito);
	}

	@PostMapping("/save")
	public DistritoPojo save(@RequestBody DistritoPojo distritoPojo){
		return distritoService.save(distritoPojo);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id")int idDistrito){
		return distritoService.delete(idDistrito);
	}

}