package com.byt;

import com.byt.models.Gender;
import com.byt.models.Location;
import com.byt.models.User;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("hello world");
        System.out.println(User.getUsersInSameLocation(new User("John",
                "Doe",
                "Street name, England",
                22,
                Gender.MALE,
                "johndoe@gmail.com",
                20.0,
                Gender.FEMALE,
                new Location("England", "London"))));
    }
}
