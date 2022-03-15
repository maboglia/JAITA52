package com.boglia.services;

import java.util.List;

import com.boglia.entities.Provincia;

public interface PopolazioneService {

	List<Provincia> getProvince();
	List<Provincia> getProvinceByRegione(String regione);
	List<String> getRegioni();
	Provincia getProvinciaByComune(String comune);
	
	
	
}
