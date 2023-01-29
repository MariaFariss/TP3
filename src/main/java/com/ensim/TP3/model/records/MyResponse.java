package com.ensim.TP3.model.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MyResponse(String type, String version, Feature[] features) {

  
}
