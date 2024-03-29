package com.solvd.testautomation.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url="${config.weather_api_url}/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${key}",methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/get/current_weather_rs.json")
public class GetCurrentWeatherByCoordinates extends AbstractApiMethodV2 {

    public GetCurrentWeatherByCoordinates(double lat, double lon,String token) {

//        super(null,"api/current_weather_rs.json");
//        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("lat", String.valueOf(lat));
        replaceUrlPlaceholder("lon", String.valueOf(lon));
        replaceUrlPlaceholder("key",token);
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
