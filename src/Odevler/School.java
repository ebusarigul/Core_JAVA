package Odevler;

import java.util.*;

public class School {
    //Student adinda bir class aciniz (id(int), name(String), surname(String)
    //5 tane ogrenci tanimlayiniz, her ogrencinin takip eden
    // bir numarasi olmali, ve en son kac ogrenci oldugunu bulabilmeliyim
    public static void main(String[] args) {

        String [][] chs= new String[2][];




        Scanner number = new Scanner(System.in);


        int secim = 0;

        do {
            Student.menuYaz();
            System.out.print("seciminizi giriniz:");
            secim = number.nextInt();
            Student.islem(secim);
            System.out.println("Student.getTotal() = " + Student.getTotal());
        } while (secim < 6);
    }
}

// TODO : kullaniciya bir menu ile ogrenci ekleme, silme, arama ve duzeltme imkani veriniz.
// TODO : ogrenci silinse bile en son ogrenci sayisi dogru gozukmeli.