package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Hotels {
    String Name;
    long Regular_Price;
    String start;
    String end;
    Hotels(String name, long regular_price,String start,String end) {
        this.Name = name;
        this.Regular_Price = regular_price;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        System.out.println("The Name of the Hotel is : " + Name);
        System.out.println("The Regular Price of an Hotel is : " + Regular_Price);
        System.out.println("The Start Date of the Hotel is : " +start);
        System.out.println("The end Date of the Hotel is : " +end);
        return "";
    }
}
public class Main {
    static List<Hotels> hotelList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static String cheapest(String Start,String end) {
        long min= Integer.MAX_VALUE;
//        System.out.println(min);
        String name = null;

        for (Hotels hotels : hotelList) {
            if(Start.equals(hotels.start) && end.equals(hotels.end)) {
                if (hotels.Regular_Price < min) {
                    min = hotels.Regular_Price;
                    name = hotels.Name;

                }
            }
        }

        return name;
    }
    static Boolean addHotel(String name, long regular_price,String start,String end) {
        Hotels hot = new Hotels(name, regular_price, start, end );
        hotelList.add(hot);
        if(name.equals(hot.Name) && regular_price == hot.Regular_Price) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        Main m = new Main();
        m.addHotel("LakeView",20000,"20-may-2002","21-july-2002");
        m.addHotel("TajLand Ends",4000,"20-may-2002","21-july-2002");
        m.addHotel("LakePlacids",5000,"20-jan-2002","11-feb-2002");
        m.addHotel("TajLand Ends",4000,"22-nov-2002","22-dec-2002");

    }
}
