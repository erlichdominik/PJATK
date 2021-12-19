package com.byt.test.models;

import com.byt.main.models.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class UserTest {
    User u1, u2;

    @Before
    public void setUp() {
        u1 = new User(
                "John",
                "Doe",
                "Diamond Street 22",
                24,
                Gender.MALE,
                "johndoe@gmail.com",
                11.00,
                Gender.FEMALE,
                new Location("England", "Liverpool"),
                Arrays.asList(
                        new Hobby("swimming"),
                        new Hobby("travelling")),
                Arrays.asList(
                        new Picture("example image".getBytes(), 14L),
                        new Picture("example image2".getBytes(), 23L)));
    }

    @Test
    public void testGetUserName() {
        Assert.assertEquals("John", u1.getName());
    }

    @Test
    public void testGetUserSurname() {
        Assert.assertEquals("Doe", u1.getSurname());
    }

    @Test
    public void testGetUserAddress() {
        Assert.assertEquals("Diamond Street 22", u1.getAddress());
    }

    @Test
    public void testGetUserAge() {
        Assert.assertEquals(24, u1.getAge(), 0.00001);
    }

    @Test
    public void testGetUserGender() {
        Assert.assertEquals(Gender.MALE, u1.getGender());
    }

    @Test
    public void testGetUserEmail() {
        Assert.assertEquals("johndoe@gmail.com", u1.getEmail());
    }

    @Test
    public void testGetUserLocationRange() {
        Assert.assertEquals(11.00, u1.getLocationRange(), 0.00001);
    }

    @Test
    public void testGetGenderPreferences() {
        Assert.assertEquals(Gender.FEMALE, u1.getGenderPreference());
    }

    @Test
    public void testGetLocation() {
        Assert.assertEquals("Location", new Location("England", "Liverpool"), u1.getLocation());
    }

    @Test
    public void testGetHobbies() {
        Assert.assertEquals("Hobbies", Arrays.asList(
                new Hobby("swimming"),
                new Hobby("travelling")
        ), u1.getHobbies());
    }

    @Test
    public void testGetPictures() {
        Assert.assertEquals(Arrays.asList(
                new Picture("example image".getBytes(), 14L),
                new Picture("example image2".getBytes(), 23L)
        ), u1.getPictures());
    }

    @Test
    public void testSetUserName() {
        u1.setName("Anna");

        Assert.assertEquals("Anna", u1.getName());
    }

    @Test
    public void testSetUserSurname() {
        u1.setSurname("Smith");

        Assert.assertEquals("Smith", u1.getSurname());
    }

    @Test
    public void testSetUserAddress() {
        u1.setAddress("Aleje Jerozolimskie");

        Assert.assertEquals("Aleje Jerozolimskie", u1.getAddress());
    }

    @Test
    public void testGetUserAge() {
        Assert.assertEquals(24, u1.getAge(), 0.00001);
    }

    @Test
    public void testGetUserGender() {
        Assert.assertEquals(Gender.MALE, u1.getGender());
    }

    @Test
    public void testGetUserEmail() {
        Assert.assertEquals("johndoe@gmail.com", u1.getEmail());
    }

    @Test
    public void testGetUserLocationRange() {
        Assert.assertEquals(11.00, u1.getLocationRange(), 0.00001);
    }

    @Test
    public void testGetGenderPreferences() {
        Assert.assertEquals(Gender.FEMALE, u1.getGenderPreference());
    }

    @Test
    public void testGetLocation() {
        Assert.assertEquals("Location", new Location("England", "Liverpool"), u1.getLocation());
    }

    @Test
    public void testGetHobbies() {
        Assert.assertEquals("Hobbies", Arrays.asList(
                new Hobby("swimming"),
                new Hobby("travelling")
        ), u1.getHobbies());
    }

    @Test
    public void testGetPictures() {
        Assert.assertEquals(Arrays.asList(
                new Picture("example image".getBytes(), 14L),
                new Picture("example image2".getBytes(), 23L)
        ), u1.getPictures());
    }

}

