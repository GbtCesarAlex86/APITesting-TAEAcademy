package com.globant.utils.tests;

import com.globant.lib.models.Person;
import com.globant.lib.services.MainService;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import static com.globant.utils.Constants.*;

public class BaseTest {

    protected MainService mainService;

    @BeforeTest
    public void connectionSetUp() {
        RestAssured.baseURI = getBaseUrl();
        mainService = new MainService();
    }

    protected Person getPerson(int personId) {
        Response response = mainService.createPeopleService().getPerson(personId);
        validateStatusCode(response.getStatusCode(), SUCCESS_GET_STATUS_CODE);
        return response.as(Person.class);
    }

    protected void validateSkinColor(Person person, String expectedSkinColor){
        validateStrings(person.getSkinColor(), expectedSkinColor);
    }

    protected void validateAmountOfFilmsItAppears(Person person, int expectedFilmCount) {
        validateQuantity(person.getFilms().size(), expectedFilmCount);
    }

    private void validateStatusCode(int actualStatusCode, int expectedStatusCode){
        Assert.assertEquals(actualStatusCode, expectedStatusCode);
    }

    private void validateStrings(String actualString, String expectedString){
        Assert.assertEquals(actualString, expectedString);
    }

    private void validateQuantity(int actualNumber, int expectedNumber){
        Assert.assertEquals(actualNumber, expectedNumber);
    }

    private String getBaseUrl(){
        return BASE_URL;
    }

}