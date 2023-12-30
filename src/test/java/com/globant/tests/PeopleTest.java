package com.globant.tests;

import com.globant.lib.models.Person;
import com.globant.utils.tests.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.globant.utils.Constants.*;

public class PeopleTest extends BaseTest {

    @Test
    @Parameters({"personId"})
    public void peopleEndPointTest(int personId) {
        Person personResponse = getPerson(personId);
        validateSkinColor(personResponse, SKIN_COLOR);
        validateAmountOfFilmsItAppears(personResponse, FILM_COUNT);
    }
}