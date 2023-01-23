package com.ensim.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ensim.TP3.model.AddressRepository;

@Controller
public class MeteoController {
	 @Autowired
	    AddressRepository addressRepository;

	    @PostMapping("/meteo")
	    public String showAddresses(@RequestParam(name="address") String nameGET, Model model) {
	    	model.addAttribute("nomTemplate", nameGET);
	        return "meteo";
	    }
}
