package Odevler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Student adinda bir class aciniz (id(int), name(String), surname(String)
//5 tane ogrenci tanimlayiniz, her ogrencinin takip eden bir numarasi olmali, ve en son kac ogrenci oldugunu bulabilmeliyim
public class Student {
    final int id;
    String name;
    String surname;

    public static Map<Integer, Student> ogrlist = new HashMap<>();

    static int sayac = 0;

    public Student(String name, String surname) {
        this.id = ++sayac;
        this.name = name;
        this.surname = surname;
    }

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public static int getTotal() {
        return sayac;
    }


    public static void menuYaz() {
        System.out.println("1-ogrenci ekleme\n2-ogrenci silme\n3-ogrenci arama\n4-ogrenci duzeltme\n5-ogrenci listesi\n6-cikis");
    }

    public static int islem(int secim) {
        Scanner read = new Scanner(System.in);
        int id = 0;
        switch (secim) {
            case 1:
                System.out.print("ogrencinin ismini giriniz:");
                String isim = read.next();
                System.out.print("ogrencinin soyadi:");
                String soyad = read.next();
                Student yeni = new Student(isim, soyad);
                ogrlist.put(sayac, yeni);
                break;
            case 2:
                System.out.print("silmek istediginiz ogrencinin idsini giriniz:");
                id = read.nextInt();
                ogrlist.remove(id);
                --sayac;
                break;
            case 3:
                System.out.print("aramak istediginiz ogrencinin idsini giriniz:");
                id = read.nextInt();
                System.out.println("Ogrenci :" + ogrlist.get(id));
                break;
            case 4:
                System.out.print("duzeltmek istediginiz ogrencinin idsini giriniz:");
                id = read.nextInt();
                System.out.print("yeni isimi girin:");
                String yeniIsim = read.next();
                System.out.print("yeni soyadi girin:");
                String yeniSoyad = read.next();
                yeni = new Student(id, yeniIsim, yeniSoyad);

                ogrlist.put(id, yeni);

                break;
            case 5:
                System.out.println("ogrList = " + ogrlist);
                break;
            case 6:
                System.out.println("Cikis yapiliyor..");
                break;
        }
        return secim;
    }

    public String toString() {
        return name + " " + surname + " " + id;
    }
}
