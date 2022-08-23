package Odevler;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("ilk sayi giriniz ");
        int ilk = oku.nextInt();
        System.out.println("ikinci sayi giriniz ");
        int ikinci = oku.nextInt();

        ekokBul(ilk,ikinci);

        ebobBul(ilk, ikinci);



    }

    private static void ekokBul(int ilk, int ikinci) {

        int buyuk = Math.max(ilk, ikinci);
        int ekok = 0;
        for (int i = buyuk; i <= ilk * ikinci; i++) {
            if (i % ilk == 0 && i % ikinci == 0) {
                ekok = i;
                System.out.println("ekok = " + ekok);
                break;
            }
        }
    }

    private static void ebobBul(int ilk, int ikinci) {
        int kucuk=Math.max(ilk, ikinci);
        int ebob=0;
        for (int i = 1; i <=kucuk ; i++) {
            if (ilk % i == 0 && ikinci % i == 0){
                ebob=i;
            }
        }
        System.out.println("ebob = " + ebob);

    }

}

