package org.example;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    @Test
    public void testAdd(){
        Main m = new Main();
        Assert.assertTrue(m.addHotel("LakeView",20000));
        Assert.assertTrue(  m.addHotel("TajLand Ends",4000));
    }
}