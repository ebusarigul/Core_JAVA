package Odevler.Gun35Odevler;

import java.util.Collections;

public class soru1 {
    public static void main(String[] args) {
    // Bir okulun çalışanı ve öğrencilerinin kayıt altına alındığı bir program yapılmak isteniyor.
        //1- Calisan ların isim, adres, Okul, maas ve UyeTipi (Enum: Ogrenci, Calisan)  bilgileri vardır.
        //2- Öğrenci lerin isim, adres, Okul, ücret ve UyeTipi (Enum: Ogrenci, Calisan)  bilgileri vardır.
        //3- Okul un ise ismi, maxOgrenciSayisi, Öğrencileri ve Calisanlari vardır.
        //4- Main kısmında 2 öğrenci 2 çalışan oluşturup, bunları okula ekleyiniz. ve sonra listeletiniz.

        Okul okul=new Okul();

        Ogrenci ogr1=new Ogrenci("Ebubekir","Bursa","TechnoStudy",UyeTipi.Ogrenci,"1500$");
        okul.setOgrenci(ogr1);
        Ogrenci ogr2=new Ogrenci("Havva","Bursa","TechnoStudy",UyeTipi.Ogrenci,"1500$");
        okul.setOgrenci(ogr2);

        Okul.ogrler.add(ogr1);
        Okul.ogrler.add(ogr2);

        Calisan cl1=new Calisan("İsmet","London","TechnoStudy",UyeTipi.Calisan,40000);
        okul.setCalisan(cl1);
        Calisan cl2=new Calisan("Halit","USA","TechnoStudy",UyeTipi.Calisan,40000);
        okul.setCalisan(cl1);

        Okul.calisanlar.add(cl1);
        Okul.calisanlar.add(cl2);

        System.out.println(okul);
        Okul.ogrList();
        Okul.calisanlarList();


















    }
}
