package com.boglia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boglia.entities.Prodotto;
import com.boglia.services.ProdottoService;

@SpringBootTest
class MagazzinoApplicationTests {

	@Autowired
	private ProdottoService service;
	
	
	@Test
	void contextLoads() {
		
		Prodotto p1 = new Prodotto("latte", 10);
		Prodotto p2 = new Prodotto("pane", 20);
		Prodotto p3 = new Prodotto("biscotti", 30);
		
		service.addProdotto(p1);
		service.addProdotto(p2);
		service.addProdotto(p3);
		
	
		
		
	}

}
