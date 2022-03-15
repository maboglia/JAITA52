package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Prodotto;
import com.boglia.repos.ProdottoDAO;

@Service
public class ProdottoServiceImpl implements ProdottoService {

	@Autowired
	private ProdottoDAO repo;
	
	@Override
	public void addProdotto(Prodotto p) {
		repo.save(p);

	}

	@Override
	public void updateProdotto(Prodotto p) {
		repo.save(p);
	}

	@Override
	public void deleteProdotto(int id) {
		repo.deleteById(id);

	}

	@Override
	public Prodotto getProdotto(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Prodotto> getProdotti() {
		return repo.findAll();
	}

}
