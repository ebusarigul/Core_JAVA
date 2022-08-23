package Odevler.Gun38Odevler.soru4;

import java.util.ArrayList;

public class Costco extends Amazon{
    @Override
    public String isFreeShipping(ArrayList<String> total) {
        getthetotal=0;
        for (String s : total) {
            if (s.contains("K")) {
                getthetotal += 1000 * Integer.parseInt(s.replaceAll("[^0-9]", ""));
            } else {
                getthetotal += Integer.parseInt(s.replaceAll("[^0-9]", ""));
            }
        }
        if (getthetotal >= CostcoMinFreeDelivery) {
            return "you are eligible for free delivery";
        } else {
            return "you need to buy " + (CostcoMinFreeDelivery - getthetotal) + " $ amount of item.";
        }

    }
}
