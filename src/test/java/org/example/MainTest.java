package org.example;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    Main m = new Main();
    @Test
    public void testAdd(){

        Assert.assertTrue(m.addHotel("LakeView",20000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",30000));
        Assert.assertTrue(  m.addHotel("TajLand Ends",4000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",6000));
        Assert.assertTrue(  m.addHotel("LakePlacids",5000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",7000));
        Assert.assertTrue(  m.addHotel("TajLand Ends",4000,"22-nov-2002","22-dec-2002","10-dec-2002","11-dec-2002",5000));
    }

    @Test
    public void testcheapest(){
        m.addHotel("LakeView",20000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",30000);
        m.addHotel("TajLand Ends",4000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",6000);
        m.addHotel("LakePlacids",5000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",7000);
        m.addHotel("TajLand Ends",4000,"22-nov-2002","22-dec-2002","10-dec-2002","11-dec-2002",5000);
        String str = m.cheapest("20-may-2002","21-july-2002","26-may-2002","27-may-2002");
        Assert.assertEquals("TajLand Ends",str);
    }
}