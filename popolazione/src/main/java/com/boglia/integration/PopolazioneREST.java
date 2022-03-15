package com.boglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Provincia;
import com.boglia.services.PopolazioneService;

@RestController
@RequestMapping("api") 
public class PopolazioneREST {

	@Autowired
	private PopolazioneService service;
	
	
	@GetMapping("regioni")
	public List<String> getRegioni() {
		return service.getRegioni();
	}
	
	@GetMapping("regioni/{regione}")
	public List<Provincia>  getProvinceByRegione(@PathVariable String regione) {
		return service.getProvinceByRegione(regione);
	}
	
	@GetMapping("regioni/comuni/{comune}")
	public Provincia getComune(@PathVariable String comune) {
		
		 return service.getProvinciaByComune(comune);
		
	}
	
	@GetMapping("eta")
	public String getEta(Model m) {
		m.addAttribute("titolo", "Seleziona una fascia di età");
		return "eta";
	}
	
}
