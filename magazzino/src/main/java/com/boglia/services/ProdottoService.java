package com.boglia.services;

import java.util.List;

import com.boglia.entities.Prodotto;

public interface ProdottoService {

	void addProdotto(Prodotto p);
	void updateProdotto(Prodotto p);
	void deleteProdotto(int id);
	
	Prodotto getProdotto(int id);
	List<Prodotto> getProdotti();
	
}
