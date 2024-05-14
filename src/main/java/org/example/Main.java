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
    String start_week;
    String end_week;
    int Rating;

    long week_price;
    Hotels(String name, long regular_price,String start,String end,String start_week,String end_week,long week_price,int Rating) {
        this.Name = name;
        this.Regular_Price = regular_price;
        this.start = start;
        this.end = end;
        this.start_week = start_week;
        this.end_week = end_week;
        this.week_price = week_price;
        this.Rating = Rating;
    }

    @Override
    public String toString() {
        System.out.println("The Name of the Hotel is : " + Name);
        System.out.println("The Regular Price of an Hotel is : " + Regular_Price);
        System.out.println("The Start Date of the Hotel is : " +start);
        System.out.println("The end Date of the Hotel is : " +end);
        System.out.println("The Week Date start of the Hotel is : " +start_week);
        System.out.println("The Week end Date of the Hotel is : " +end_week);
        System.out.println("The Weekend Price of an Hotel is : " + week_price);

        return "";
    }
}
public class Main {
    static List<Hotels> hotelList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static String cheapest(String Start,String end,String weekstart, String weekend) {
        long min= Integer.MAX_VALUE;
        long min1 = Integer.MAX_VALUE;
        int flag=0;
//        System.out.println(min);
        String name = null;

        for (Hotels hotels : hotelList) {
            if(Start.equals(hotels.start) && end.equals(hotels.end) && weekstart.equals(hotels.start_week) && weekend.equals(hotels.end_week)) {
                if (hotels.Regular_Price < min && hotels.week_price < min1 && flag < hotels.Rating) {
                    min = hotels.Regular_Price;
                    min1 = hotels.week_price;
                    name = hotels.Name;
                    flag = hotels.Rating;
                }
            }
        }
        return name;
    }
    static Boolean addHotel(String name, long regular_price,String start,String end,String start_week,String end_week,long week_price,int Rating) {
        Hotels hot = new Hotels(name,regular_price,start,end,start_week,end_week,week_price,Rating);
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
        m.addHotel("LakeWood",20000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",30000,3);
        m.addHotel("BridgeWood",4000,"20-may-2002","21-july-2002","26-may-2002","27-may-2002",6000,4);
        m.addHotel("RidgeWood",5000,"20-jan-2002","11-feb-2002","25-jan-2002","26-jan-2002",7000,5);

    }

}
