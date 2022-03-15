package com.boglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boglia.services.PopolazioneService;

@Controller
public class PopolazioneMVC {

	@Autowired
	private PopolazioneService service;
	
	
	@GetMapping("regioni")
	//@ResponseBody
	public String getRegioni(Model m) {
		
		m.addAttribute("titolo", "Seleziona una regione");
		m.addAttribute("elenco", service.getRegioni());
		return "regioni";
	}
	
	@GetMapping("eta")
	//@ResponseBody
	public String getEta(Model m) {
		m.addAttribute("titolo", "Seleziona una fascia di età");
		return "eta";
	}
}
