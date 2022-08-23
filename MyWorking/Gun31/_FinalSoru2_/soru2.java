package Gun31._FinalSoru2_;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);
        System.out.print("gün sayısı giriniz = ");
        int gun = oku.nextInt();
        System.out.print("saat giriniz = ");
        int saat = oku.nextInt();
        System.out.print("dakika giriniz = ");
        int dakika = oku.nextInt();

       /* toplamsaniye = (gun * Sabitler.gundekisaatsayisi * Sabitler.saattekidakikasayisi * Sabitler.dakikadakisaniyesayisi)+
                (saat*Sabitler.saattekidakikasayisi*Sabitler.dakikadakisaniyesayisi)+(dakika*Sabitler.dakikadakisaniyesayisi);
        System.out.println("toplam saniye " + toplamsaniye);*/

        System.out.println("toplam saniye = " + Sabitler.hesapla(gun, saat, dakika));


    }
}

class Sabitler {
    static final int gundekisaatsayisi = 24;
    static final int saattekidakikasayisi = 60;
    static final int dakikadakisaniyesayisi = 60;

    public static int hesapla(int gun, int saat, int dakika) {
        int toplamsaniye = (gun * Sabitler.gundekisaatsayisi * Sabitler.saattekidakikasayisi * Sabitler.dakikadakisaniyesayisi) +
                (saat * Sabitler.saattekidakikasayisi * Sabitler.dakikadakisaniyesayisi) + (dakika * Sabitler.dakikadakisaniyesayisi);
        System.out.println("toplam saniye " + toplamsaniye);
        return toplamsaniye;

    }

}