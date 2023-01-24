package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.TipoMascotaPojo;
import com.pluton.veterianaria.domain.services.TipoMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/tipomascota")
public class TipoMascotaController {

	@Autowired
	private TipoMascotaService tipoMascotaService;


}