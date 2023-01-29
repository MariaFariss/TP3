package com.ensim.TP3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record City(String insee, Double cp, String name ) {

    
}
