package com.ensim.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.ensim.TP3.model.AddressRepository;
import com.ensim.TP3.model.MyResponse;
import com.ensim.TP3.model.ResponseEtape5;

@Controller
public class MeteoController {
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/meteo")
	public String showAddresses(@RequestParam(name = "address") String nameGET, Model model) {
		// MyResponse myresponse =
		// restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+nameGET,
		// MyResponse.class);
		MyResponse myresponse = restTemplate
				.getForEntity("https://api-adresse.data.gouv.fr/search/?q=" + nameGET, MyResponse.class).getBody();
		model.addAttribute("nomTemplate", nameGET);
		for (int i = 0; i < myresponse.features().length; i++) {
			model.addAttribute("coordinates" + i, myresponse.features()[i].geometry().coordinates());
		}

		// Etape5
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer ae2b95fedaf1e06c2e13e7454dee3a87434e33df6ef81fc0f18f3b72a17ac825");
		HttpEntity<String> request = new HttpEntity<>(headers);
		ResponseEtape5 response = restTemplate.exchange("https://api.meteo-concept.com/api/forecast/daily/periods?latlng=48.086%2C-2.635&insee=35238", HttpMethod.GET, request,
		ResponseEtape5.class).getBody();
		model.addAttribute("insee", response.city().insee());
		model.addAttribute("name", response.city().name());
		model.addAttribute("cp", response.city().cp());
		
		return "meteo";
	}

}
