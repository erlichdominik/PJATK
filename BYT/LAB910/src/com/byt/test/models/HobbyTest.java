package com.byt.test.models;

import com.byt.main.models.Hobby;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HobbyTest {
    Hobby hobby1, hobby2;

    @Before
    public void setUp() {
        hobby1 = new Hobby("swimming");
        hobby2 = new Hobby("walking");
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("swimming", "swimming", hobby1.getName());
        Assert.assertEquals("walking", "walking", hobby2.getName());
    }

    @Test
    public void testSetName() {
        //given
            //hobby1, hobby2
        //when
            hobby1.setName("photography");
        //then
            Assert.assertEquals("photography", "photography", hobby1.getName());
    }

}
