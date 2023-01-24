package com.pluton.veterianaria.web.controller;

import com.pluton.veterianaria.domain.ProvinciaPojo;
import com.pluton.veterianaria.domain.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/provincia")
public class ProvinciaController {

	@Autowired
	private ProvinciaService provinciaService;


}