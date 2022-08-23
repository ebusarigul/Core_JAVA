package Odevler.Gun39Odevler.Soru3;

import java.util.ArrayList;

public class Samsung extends Phone{
    @Override
    ArrayList<String> options(String kapasite, String boyut) {
        if (kapasite.contains("256 GB") &&  boyut.contains("5.5")) {
            Phone.cart.add("$1000");
        }
        else if (kapasite.contains("256 GB") &&  boyut.contains("7.5")) {
            Phone.cart.add("$1200");
        }
        else if (kapasite.contains("512 GB") && boyut.contains("5.5")) {
            Phone.cart.add("$1300");
        }
        else if (kapasite.contains("512 GB") && boyut.contains("6.5")) {
            Phone.cart.add("$1400");
        }
        else {
            System.out.println("böyle bir Samsung modeli yoktur");
        }
        return cart;
    }
}
