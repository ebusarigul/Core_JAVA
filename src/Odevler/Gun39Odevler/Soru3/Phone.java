package Odevler.Gun39Odevler.Soru3;

import java.util.ArrayList;

public abstract class Phone {

    static ArrayList<String> cart=new ArrayList<>();

    public int getSum(ArrayList<String> cart) {
        int getTotal = 0;
        for (String c : cart) {
            getTotal += Integer.parseInt(c.replaceAll("[^0-9]", ""));
        }
        return getTotal;

    }

    abstract ArrayList<String> options(String kapasite,String boyut);

}

