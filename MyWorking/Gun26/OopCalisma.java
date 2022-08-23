package Gun26;

import java.util.ArrayList;
import java.util.Scanner;

public class OopCalisma {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // Kullanıcıdan 3 adet öğrenci bilgileri alarak doldurunuz.
        // Daha sonra bunların bilgilerini yazdırınız.

        ArrayList<Ogrenci> bilgiler = new ArrayList<>();


        Scanner oku = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Ogrenci ogrler = new Ogrenci();

            System.out.print(i + 1 + ". öğrencinin ismini giriniz = ");
            ogrler.ad = oku.nextLine();
            System.out.print(i + 1 + " ögrencinin soyadını giriniz = ");
            ogrler.soyad = oku.nextLine();
            System.out.print(i + 1 + " ögrencinin sınıfını giriniz = ");
            ogrler.sinif = okuint.nextInt();
            System.out.print(i + 1 + " ögrencinin adresini giriniz = ");
            ogrler.adres = oku.nextLine();

            bilgiler.add(ogrler);
        }

        for (Ogrenci s : bilgiler) {
            System.out.println("adı = " + s.ad);
            System.out.println("soyad = " + s.soyad);
            System.out.println("sinifi = " + s.sinif);
            System.out.println("adresi = " + s.adres);
            System.out.println();
        }


    }
}
