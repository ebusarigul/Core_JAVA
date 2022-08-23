package Gun26;

import java.util.ArrayList;
import java.util.Scanner;

public class OopCalisma2 {
    public static void main(String[] args) {

        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün sınıfı bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.


        ArrayList<Ogr> notdefteri = new ArrayList<>();
        Scanner oku = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);
        double toplam = 0;
        for (int i = 0; i < 3; i++) {

            Ogr ogrler = new Ogr();

            System.out.print("okul no giriniz = ");
            ogrler.okulNo = okuint.nextInt();
            System.out.print("tam adı giriniz = ");
            ogrler.tamAd = oku.nextLine();
            System.out.print("notunu giriniz = ");
            ogrler.not = okuint.nextInt();
            toplam = toplam + ogrler.not;

            notdefteri.add(ogrler);

        }
        for (Ogr s : notdefteri){
            System.out.println("okulNo = " + s.okulNo);
            System.out.println("tamAd = " + s.tamAd);
            System.out.println("not = " + s.not);
        }
        ortalamabul(toplam);


    }

    public static double ortalamabul(double toplam) {
        double ort = toplam / 3;
        System.out.println("ort = " + ort);
        return ort;
    }

}

