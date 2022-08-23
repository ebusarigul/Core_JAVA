package MySrc.Gun33.EncSoru2;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
        //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
        //  3- Bütün fieldlar için encapsulation uygulayınız.
        //  4- okul isimli bir class tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
        //     ArrayList cinsinden Öğrencileri olsun.
        //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
        //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
        //     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
        //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
        //  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.

        Scanner oku = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);

        ArrayList<Ogrenci> ogrliste = new ArrayList<>();
        Okul okul = new Okul("Turhan Tayan", ogrliste);

        int sayac = 0;
        do {

            System.out.print("isim giriniz = ");
            String isim = oku.nextLine();
            System.out.print("soyad giriniz = ");
            String soyad = oku.nextLine();
            System.out.print("yas giriniz = ");
            int yas = okuint.nextInt();

            if (yas <= 15) {
                ogrliste.add(new Ogrenci(isim, soyad, yas));
                System.out.println(ogrliste);
            } else {
                System.out.println("yasınız cok buyuk ! ");
                continue;
            }

            System.out.println();

            sayac++;


        } while (sayac < Okul.maxOgrenciSayisi);
        if (sayac == Okul.maxOgrenciSayisi){
            System.out.println("kontenjan doldu");
        }

        }

}
