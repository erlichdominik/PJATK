package com.byt.models;

import java.util.Arrays;
import java.util.List;

public class User extends Person {

    private String email;
    private Double locationRange;
    private Gender genderPreference;
    private Location location;

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", locationRange=" + locationRange +
                ", genderPreference=" + genderPreference +
                ", location=" + location +
                '}';
    }

    public User(String name, String surname, String address, Integer age, Gender gender, String email, Double locationRange, Gender genderPreference, Location location) {
        super(name, surname, address, age, gender);
        this.email = email;
        this.locationRange = locationRange;
        this.genderPreference = genderPreference;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getLocationRange() {
        return locationRange;
    }

    public void setLocationRange(Double locationRange) {
        this.locationRange = locationRange;
    }

    public Gender getGenderPreference() {
        return genderPreference;
    }

    public void setGenderPreference(Gender genderPreference) {
        this.genderPreference = genderPreference;
    }

    public Location getCurrentLocation() {
        return this.location;
    }

    public static List<User> getUsersInSameLocation(User user) {
        return Arrays.asList(
                new User("John",
                        "Doe",
                        "Street name, England",
                        22,
                        Gender.MALE,
                        "johndoe@gmail.com",
                        20.0,
                        Gender.FEMALE,
                        new Location("England", "London")),

                new User("Anna",
                        "Smith",
                        "Street name, England",
                        19,
                        Gender.FEMALE,
                        "johndoe@gmail.com",
                        24.0,
                        Gender.MALE,
                        new Location("England", "London"))

        );
    }

}
