package Odevler.Gun39Odevler.Soru3;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru3Main {
    static Scanner oku = new Scanner(System.in);

    public static void main(String[] args) {
        //3-//4 class oluşturulmuştur. Phone, Apple, Samsung, Main
        //Phone'u super class yapın.
        //cart isimli, String'i alarak bir static arraylist oluşturun.
        //getSum isimli, arraylist'i parametre aldığınız bir method oluşturun.
        //ve return tipi int;
        //                 arraylist'in içindeki bütün seçenekleri elde edin ve sayısal
        //                 olmayan karakterleri(a b c... A B C...) ve özel karakterleri (.,!'^+...)
        //                 sonra bunları int'e çevirin.
        //                 tüm sayıları toplayın.
        //ismi options olan bir abstract method oluşturun.
        //Apple class'ın içinde;
        //            Phone class'ı extend edin.
        //            option method'u override edin.
        //            parametre olarak 2 String vardır.
        //Eğer birinci String 64 GB ve 5.5 inch ise
        //                         cart arraylist'ine "$750" ekleyin.
        //Eğer birinci String 64 GB ve 6.5 inch ise
        //                         cart arraylist'ine "$850" ekleyin.
        //Eğer birinci String 128 GB ve 5.5 inch ise
        //                         cart arraylist'ine "$950" ekleyin.
        //Eğer birinci String 128 GB ve 6.5 inch ise
        //                         cart arraylist'ine "$1200" ekleyin.
        //Samsung class'ın içinde;
        //            Phone class'ı extend edin.
        //            option method'u override edin.
        //            parametre olarak 2 String vardır.
        //Eğer birinci String 256 GB ve 5.5 inch ise
        //                         cart arraylist'ine "$1000" ekleyin.
        //Eğer birinci String 256 GB ve 7.5 inch ise
        //                         cart arraylist'ine "$1200" ekleyin.
        //Eğer birinci String 512 GB ve 5.5 inch ise
        //                         cart arraylist'ine "$1300" ekleyin.
        //Eğer birinci String 512 GB ve 6.5 inch ise
        //                         cart arraylist'ine "$1400" ekleyin.
        //Main class'ının içinde;
        //         scanner class object yarat.
        //              iki adet String oluşturun str1, str2 ve scanner object'ini String'lere atayın.
        //apple class'ı için object oluştur.
        //options method'unu apple class'ının içine çağır.
        //options parametreleri, daha önce oluşturulan iki String'lerdir.
        //İki adaet String oluşturun. str3 ve str4, sonra scanner object'i bu String'lere atayın.
        //           samsung class'ı için object oluşturun.
        //           options method'unu samsung class'ının içinde çağırın.
        //           options parametreleri daha önce oluşturulan iki String'dir.
        //getSum method'unu Phone class'ının içinde çağırın.
        //sonucu yazdırın.


        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.println("-----APPLE IPHONE FİYATLARI-----");
                System.out.println("kaç gb telefon istiyorsunuz = ");
                String kapasite = oku.nextLine();
                System.out.println("ekran boyutu kaç inc olsun = ");
                String boyut = oku.nextLine();

                Apple apple = new Apple();
                apple.options(kapasite, boyut);
                System.out.println("Toplam Fiyat = " + apple.getSum(Phone.cart) + "$");
            } else {
                System.out.println("-----SAMSUNG FİYATLARI-----");
                System.out.println("kaç gb telefon istiyorsunuz = ");
                String kapasite = oku.nextLine();
                System.out.println("ekran boyutu kaç inc olsun = ");
                String boyut = oku.nextLine();

                Phone.cart=new ArrayList<>();
                Samsung samsung = new Samsung();
                samsung.options(kapasite, boyut);
                System.out.println("Toplam Fiyat = " + samsung.getSum(Phone.cart) + "$");

            }


        }


    }


}
