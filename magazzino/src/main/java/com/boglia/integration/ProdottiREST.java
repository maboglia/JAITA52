package com.boglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Prodotto;
import com.boglia.services.ProdottoService;

@RestController
@RequestMapping("api")
public class ProdottiREST {

	@Autowired
	private ProdottoService service;
	
	@GetMapping
	public List<Prodotto> tutti(){
		return service.getProdotti();
	}
	
	@GetMapping("/{id}")
	public Prodotto uno(@PathVariable int id){
		return service.getProdotto(id);
	}
	
	
}
