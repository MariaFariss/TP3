package com.ensim.TP3.model.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Forecast(float latitude, float longitude, Double day, String datetime, double weather, float tmin, float tmax, double sun_hours) {
}
