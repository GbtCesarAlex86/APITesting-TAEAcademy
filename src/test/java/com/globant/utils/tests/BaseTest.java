package com.globant.utils.tests;

import com.globant.lib.services.MainService;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

import static com.globant.utils.Constants.BASE_URL;

public class BaseTest {

    protected MainService mainService;

    @BeforeTest
    public void connectionSetUp() {
        RestAssured.baseURI = BASE_URL;
        mainService = new MainService();
    }

}
