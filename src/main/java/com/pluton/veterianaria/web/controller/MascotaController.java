package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.MascotaPojo;
import com.pluton.veterianaria.domain.services.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/mascota")
public class MascotaController {

	@Autowired
	private MascotaService mascotaService;


}