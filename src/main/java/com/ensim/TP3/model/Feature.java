package com.ensim.TP3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Feature(String type, Geometry geometry) {
    
}
