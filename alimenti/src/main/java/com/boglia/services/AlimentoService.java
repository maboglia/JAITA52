package com.boglia.services;

import java.util.List;

import com.boglia.entities.Alimento;

public interface AlimentoService {

	
	//CRUD
	void addAlimento(Alimento a);
	void updAlimento(Alimento a);
	void delAlimento(int id);
	
	List<Alimento> getAlimenti();
	List<Alimento> getAlimentiByCategoria(String categoria);
	Alimento getAlimentoById(int id);
	List<String> getCategorie();
	
}
