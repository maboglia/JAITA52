package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.dal.AlimentoDAO;
import com.boglia.entities.Alimento;


@Service
public class AlimentoServiceImpl implements AlimentoService {

	@Autowired
	private AlimentoDAO repo;
	
	@Override
	public void addAlimento(Alimento a) {
		this.repo.save(a);

	}

	@Override
	public void updAlimento(Alimento a) {
		this.repo.save(a);

	}

	@Override
	public void delAlimento(int id) {
		this.repo.deleteById(id);

	}

	@Override
	public List<Alimento> getAlimenti() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public List<Alimento> getAlimentiByCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alimento getAlimentoById(int id) {
		// TODO Auto-generated method stub
		return this.repo.getById(id);
	}

}
