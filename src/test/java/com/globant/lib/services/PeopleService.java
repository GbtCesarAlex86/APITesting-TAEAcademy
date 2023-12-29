package com.globant.lib.services;

import com.globant.lib.models.Person;
import io.restassured.response.Response;

import static com.globant.utils.Constants.BASE_URL;
import static io.restassured.RestAssured.given;

public class PeopleService {

    private static final String PEOPLE_ENDPOINT = "people/";

    public Person getPerson(int id) {
        Response response = given()
                .baseUri(BASE_URL)
                .get(PEOPLE_ENDPOINT + id);

        return response.as(Person.class);
    }


}
