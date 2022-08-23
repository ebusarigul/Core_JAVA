package Odevler.Gun39Odevler.Soru3;

import java.util.ArrayList;

public class Apple extends Phone {

    @Override
    ArrayList<String> options(String kapasite, String boyut) {
        if (kapasite.contains("64 GB") &&  boyut.contains("5.5")) {
            Phone.cart.add("$750");
        }
        else if (kapasite.contains("64 GB") &&  boyut.contains("6.5")) {
            Phone.cart.add("$850");
        }
        else if (kapasite.contains("128 GB") && boyut.contains("5.5")) {
            Phone.cart.add("$950");
        }
        else if (kapasite.contains("128 GB") && boyut.contains("6.5")) {
            Phone.cart.add("$1200");
        }else {
            System.out.println("böyle bir İphone modeli yoktur");
        }
        return Phone.cart;
    }
}