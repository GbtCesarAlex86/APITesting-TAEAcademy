package com.globant.lib.services;

import com.globant.lib.models.Film;
import io.restassured.response.Response;

import static com.globant.utils.Constants.BASE_URL;
import static io.restassured.RestAssured.given;

public class FilmService {
    private static final String FILMS_ENDPOINT = "films/";

    public Film getFilm(int id) {
        Response response = given()
                .baseUri(BASE_URL)
                .get(FILMS_ENDPOINT + id);

        return response.as(Film.class);
    }
}
