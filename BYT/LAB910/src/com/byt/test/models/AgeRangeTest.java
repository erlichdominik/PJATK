package com.byt.test.models;

import com.byt.main.models.AgeRange;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AgeRangeTest {
    AgeRange ageRange1, ageRange2, ageRange3;

    @Before
    public void setUp() {
        ageRange1 = new AgeRange(18, 22);
        ageRange2 = new AgeRange(20, 33);
    }

    @Test
    public void testAgeRangeConstrains() {
        Exception exception = Assert.assertThrows(IllegalArgumentException.class, () -> {
            ageRange3 = new AgeRange(35, 27);
        });
        String expectedMessage = "min cannot be bigger than max";
        String actualMessage = exception.getMessage();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testGetMin() {
        Assert.assertEquals(18, ageRange1.getMin(), 0.00001);
        Assert.assertEquals(20, ageRange2.getMin(), 0.00001);
    }

    @Test
    public void testGetMax() {
        Assert.assertEquals(22, ageRange1.getMax(), 0.00001);
        Assert.assertEquals(33, ageRange2.getMax(), 0.00001);
    }

    @Test
    public void testSetMin() {
        //given
        AgeRange ageRange = new AgeRange(19, 24);
        AgeRange ageRange2 = new AgeRange(20, 30);
        //when
        ageRange.setMin(22);
        Exception exception = Assert.assertThrows(IllegalArgumentException.class, () -> {
            ageRange2.setMin(34);
        });
        //then
        Assert.assertEquals(22, ageRange.getMin(), 0.00001);
        Assert.assertTrue(exception.getMessage().contains("min cannot be bigger than max"));
    }

    @Test
    public void testSetMax() {
        //given
        AgeRange ageRange = new AgeRange(19, 24);
        AgeRange ageRange2 = new AgeRange(20, 30);
        //when
        ageRange.setMax(27);
        Exception exception = Assert.assertThrows(IllegalArgumentException.class, () -> {
            ageRange2.setMax(18);
        });
        //then
        Assert.assertEquals(27, ageRange.getMax(), 0.00001);
        Assert.assertTrue(exception.getMessage().contains("min cannot be bigger than max"));
    }

}
