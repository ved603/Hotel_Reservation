package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hotels {
    String Name;
    long Regular_Price;

    Hotels(String name, long regular_price) {
        this.Name = name;
        this.Regular_Price = regular_price;
    }

    @Override
    public String toString() {
        System.out.println("The Name of the Hotel is : " + Name);
        System.out.println("The Regular Price of an Hotel is : " + Regular_Price);
        return "";
    }
}
public class Main {
    static List<Hotels> hotelList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static Boolean addHotel(String name, long regular_price) {
        Hotels hot = new Hotels(name, regular_price);
        hotelList.add(hot);
        if(name.equals(hot.Name) && regular_price == hot.Regular_Price) {
            return true;
        }
        else{
            return false;
        }


    }
}
