package com.byt.test.models;

import com.byt.main.models.Picture;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PictureTest {
    Picture p1, p2;

    @Before
    public void setUp() {
        p1 = new Picture("example image".getBytes(), 14L);
        p2 = new Picture("example image2".getBytes(), 22L);
    }

    @Test
    public void testGetImage() {
        Assert.assertEquals("example image", new String(p1.getImage()));
        Assert.assertEquals("example image2", new String(p2.getImage()));
    }

    @Test
    public void testGetImageSize() {
        Assert.assertEquals(14L, p1.getSize(), 0.00001);
        Assert.assertEquals(22L, p2.getSize(), 0.00001);
    }

    @Test
    public void testSetImage() {
        p1.setImage("sample image".getBytes());
        p2.setImage("sample image2".getBytes());

        Assert.assertEquals("sample image", new String(p1.getImage()));
        Assert.assertEquals("sample image2", new String(p2.getImage()));
    }


    @Test
    public void testSetImageSize() {
        p1.setSize(16L);
        p2.setSize(34L);

        Assert.assertEquals(16L, p1.getSize(), 0.0001);
        Assert.assertEquals(34L, p2.getSize(), 0.0001);

    }

}
