package com.byt.main.models;

import java.util.Arrays;
import java.util.List;

public class User extends Person {

    private String email;
    private Double locationRange;
    private Gender genderPreference;
    private Location location;
    private List<Hobby> hobbies;
    private List<Picture> pictures;

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", locationRange=" + locationRange +
                ", genderPreference=" + genderPreference +
                ", location=" + location +
                '}';
    }

    public User(String name, String surname, String address, Integer age, Gender gender, String email, Double locationRange, Gender genderPreference, Location location, List<Hobby> hobbies, List<Picture> pictures) {
        super(name, surname, address, age, gender);
        this.email = email;
        this.locationRange = locationRange;
        this.genderPreference = genderPreference;
        this.location = location;
        this.hobbies = hobbies;
        this.pictures = pictures;
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
        return List.of(
                new User("John",
                        "Doe",
                        "Street name, England",
                        22,
                        Gender.MALE,
                        "johndoe@gmail.com",
                        20.0,
                        Gender.FEMALE,
                        new Location("England", "London"),
                        Arrays.asList(new Hobby("swimming"), new Hobby("walking")),
                        List.of(new Picture("sample_image".getBytes(), 12L))),

                new User("Anna",
                        "Smith",
                        "Street name, England",
                        19,
                        Gender.FEMALE,
                        "johndoe@gmail.com",
                        24.0,
                        Gender.MALE,
                        new Location("England", "London"),
                        Arrays.asList(new Hobby("travelling"), new Hobby("photography")),
                        List.of(new Picture("another_picture".getBytes(), 15L))));
    }

}
