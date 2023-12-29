package com.globant.tests;

import com.globant.lib.services.PeopleService;
import com.globant.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class PeopleTest extends BaseTest {

    @Test
    public void peopleEndPointTest() {
        PeopleService peopleService = mainService.createPeopleService();

    }
}
