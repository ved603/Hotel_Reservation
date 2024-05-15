package org.example;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    Main m = new Main();
    @Test
    public void testAdd(){

        Assert.assertTrue(m.addHotel("LakeWood",20000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",30000,3));
        Assert.assertTrue(  m.addHotel("BridgeWood",4000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",6000,4));
        Assert.assertTrue(  m.addHotel("RidgeWood",5000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",7000,5));

    }

    @Test
    public void testcheapest(){

        Assert.assertTrue(m.addHotel("LakeWood",20000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",30000,3));
        Assert.assertTrue(  m.addHotel("BridgeWood",4000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",6000,4));
        Assert.assertTrue(  m.addHotel("RidgeWood",5000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",7000,5));
        String str = m.cheapest("20-jan-2002","11-feb-2002");
        Assert.assertEquals("RidgeWood 5000",str);
    }
}