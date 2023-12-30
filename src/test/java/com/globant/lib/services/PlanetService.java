package com.globant.lib.services;

import io.restassured.response.Response;

import static com.globant.utils.Constants.BASE_URL;
import static io.restassured.RestAssured.given;

public class PlanetService {
    private static final String PLANETS_ENDPOINT = "planets/";

    public Response getPlanet(int id) {
        return given()
                .baseUri(BASE_URL)
                .get(PLANETS_ENDPOINT + id);
    }
}
