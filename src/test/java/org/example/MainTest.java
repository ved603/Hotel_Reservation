package org.example;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {
    Main m = new Main();
    @Test
    public void testAdd(){

        Assert.assertTrue( m.addHotel("LakeWood",110,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",90,3,80,80));
        Assert.assertTrue( m.addHotel("BridgeWood",150,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",50,4,110,50));
        Assert.assertTrue( m.addHotel("RidgeWood",220,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",150,5,100,40));


    }

    @Test
    public void testcheapest(){

        Assert.assertTrue(m.addHotel("LakeWood",110,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",90,3,80,80));
        Assert.assertTrue(m.addHotel("BridgeWood",150,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",50,4,110,50));
        Assert.assertTrue(m.addHotel("RidgeWood",220,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",150,5,100,40));
        String str = m.cheapest(1,"20-jan-2002","11-feb-2002");
        String str1 = m.cheapest(4,"20-jan-2002","11-feb-2002");
        Assert.assertEquals("RidgeWood 100",str);
    }
}