package com.ecommerce.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api("pedidos")
@RestController
public class PedidosController {

	@PostMapping("/v1/pedidos")
	public void post(){
		
	}
	@GetMapping("/v1/pedidos")
	public void get() {
		
	}
}
