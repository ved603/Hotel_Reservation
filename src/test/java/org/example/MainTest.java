package org.example;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    Main m = new Main();
    @Test
    public void testAdd(){

        Assert.assertTrue(m.addHotel("LakeView",20000,"20-may-2002","21-july-2002"));
        Assert.assertTrue(  m.addHotel("TajLand Ends",4000,"20-may-2002","21-july-2002"));
        Assert.assertTrue(  m.addHotel("LakePlacids",5000,"20-jan-2002","11-feb-2002"));
        Assert.assertTrue(  m.addHotel("TajLand Ends",4000,"22-nov-2002","22-dec-2002"));
    }

    @Test
    public void testcheapest(){
        m.addHotel("LakeView",20000,"20-may-2002","21-july-2002");
        m.addHotel("TajLand Ends",4000,"20-may-2002","21-july-2002");
        m.addHotel("LakePlacids",5000,"20-jan-2002","11-feb-2002");
        m.addHotel("TajLand Ends",4000,"22-nov-2002","22-dec-2002");
        String str = m.cheapest("20-may-2002","21-july-2002");
        Assert.assertEquals("TajLand Ends",str);
    }
}