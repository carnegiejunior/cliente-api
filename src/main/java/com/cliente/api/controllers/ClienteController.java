package com.cliente.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.domain.models.Cliente;
import com.cliente.domain.services.ClienteService;


@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody @Valid Cliente cliente) {
		return this.clienteService.salvar(cliente);
	}
	
	@GetMapping
	public List<Cliente> localizarTodos(){
		return this.clienteService.findAll();
	}

//	@GetMapping
//	public List<ClienteModel> pesquisar(Pageable pageable){
//		return this.clienteService.findAll(pageable);
//	}

}
