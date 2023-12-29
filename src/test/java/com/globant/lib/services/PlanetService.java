package com.globant.lib.services;

import com.globant.lib.models.Planet;
import io.restassured.response.Response;

import static com.globant.utils.Constants.BASE_URL;
import static io.restassured.RestAssured.given;

public class PlanetService {
    private static final String PLANETS_ENDPOINT = "planets/";

    public Planet getPlanet(int id) {
        Response response = given()
                .baseUri(BASE_URL)
                .get(PLANETS_ENDPOINT + id);

        return response.as(Planet.class);
    }
}
