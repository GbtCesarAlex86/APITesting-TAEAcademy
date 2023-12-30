package com.globant.tests;

import com.globant.lib.models.Person;
import com.globant.lib.services.PeopleService;
import com.globant.utils.tests.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PeopleTest extends BaseTest {

    @Test
    @Parameters({"personId", "skinColor", "filmCount"})
    public void peopleEndPointTest(int personId, String skinColor, int filmCount) {
        Person personResponse = getPerson(personId);
        validateSkinColor(personResponse, skinColor);
        validateAmountOfFilmsItAppears(personResponse, filmCount);
    }
}
