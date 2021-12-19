package com.byt.test.models;

import com.byt.main.models.Location;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LocationTest {
    Location location1, location2;

    @Before
    public void setUp() {
        location1 = new Location("Poland", "Warsaw");
        location2 = new Location("England", "Liverpool");
    }

    @Test
    public void testGetCountry() {
        Assert.assertEquals("Poland", "Poland", location1.getCountry());
        Assert.assertEquals("England", "England", location2.getCountry());
    }

    @Test
    public void testGetCity() {
        Assert.assertEquals("Poland", "Poland", location1.getCountry());
        Assert.assertEquals("England", "England", location2.getCountry());
    }

    @Test
    public void testSetters() {
        location1.setCountry("Canada");
        location1.setCity("Toronto");

        location2.setCountry("USA");
        location2.setCity("New York");

        Assert.assertEquals("Canada", "Canada", location1.getCountry());
        Assert.assertEquals("Toronto", "Toronto", location1.getCity());


        Assert.assertEquals("USA", "USA", location2.getCountry());
        Assert.assertEquals("New York", "New York", location2.getCity());
    }

    @Test
    public void testToString() {
        String expected = "Location{country='Poland', city='Warsaw'}";

        Assert.assertEquals(location1.toString(), expected);
    }

}
