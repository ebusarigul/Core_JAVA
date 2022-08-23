package Odevler.Gun38Odevler.soru4;

import java.util.ArrayList;
public interface IdeliveryOptions {
    int getTheTotal(ArrayList<String> total);
    String isFreeShipping(ArrayList<String> free);
    int AmazonMinFreeDelivery=10000;
    int CostcoMinFreeDelivery=15000;
}
