package MySrc.Gun40._02_;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe{

    static Scanner oku = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        int secim = 1;
        int adet = 0;
        do {
            TechnoKitchen.menuyaz();
            secim = oku.nextInt();
            if (secim > 0 && secim<5) {
                System.out.println("kaç porsiyon olsun=");
                adet = oku.nextInt();
            }
            for (int i = 0; i <adet ; i++) {
                TechnoKitchen.siparisleriAl(secim);
            }

        } while (secim != 0);

        TechnoKitchen.yemekHazirlama(TechnoKitchen.siparisler);
        System.out.println();
        TechnoKitchen.ucretHesapla(TechnoKitchen.siparisler);

    }

}
