package com.ensim.TP3.model.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Propertie(String label, String citycode) {

}
