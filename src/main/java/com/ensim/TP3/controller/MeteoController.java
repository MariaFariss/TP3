package com.ensim.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.ensim.TP3.model.AddressRepository;
import com.ensim.TP3.model.Feature;
import com.ensim.TP3.model.Geometry;
import com.ensim.TP3.model.MyResponse;

@Controller
public class MeteoController {
	 	@Autowired
	    AddressRepository addressRepository;
		@Autowired
		RestTemplate restTemplate;
	    @PostMapping("/meteo")
	    public String showAddresses(@RequestParam(name="address") String nameGET, Model model) {
			MyResponse myresponse = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+nameGET, MyResponse.class);
	    	model.addAttribute("nomTemplate", nameGET);
			for (int i =0; i<myresponse.features().length; i++){
				model.addAttribute("coordinates"+i, myresponse.features()[i].geometry().coordinates());
			}
			
	        return "meteo";
	    }
}
