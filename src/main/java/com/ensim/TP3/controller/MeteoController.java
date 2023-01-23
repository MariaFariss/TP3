package com.ensim.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.ensim.TP3.model.AddressRepository;

@Controller
public class MeteoController {
	 @Autowired
	    AddressRepository addressRepository;
	 	RestTemplate restemplate = new RestTemplate();
	 

	    @PostMapping("/meteo")
	    public String showAddresses(@RequestParam(name="address") String nameGET, Model model) {
	    	ResponseEntity<MyResponse> response =  restemplate.getForEntity("https://api-adresse.data.gouv.fr/search/?q=+nameGET", MyResponse.class);
	        MyResponse myResponse = response.getBody();
	    	model.addAttribute("nomTemplate", nameGET);
	        return "meteo";
	    }
}
