package Odevler.Gun39Odevler.Soru2;

import java.util.Scanner;

public class HesapMakinesiMain {
    static Scanner oku = new Scanner(System.in);

    public static void main(String[] args) {
        //2-// 6 class oluşturuldu. Calculator, Sum, Divide, Multiply , Substract , Main
        //Calculator'ı a super class yap.
        //super class'ın içinde;
        //calculating adında bir abstract method oluturunuz.
        //        Burada iki tane int parametresi vardır.
        //         return tipi int'dir.
        //Sum class'ın içinde;
        //        Calculator class'ına extend et.. (uzat, bağla)
        //        super class'ın içindeki calculating methodunu Override et.
        //        iki parametreyi topla ve sonucu return et.
        //Divide class'ının içinde,
        //         Calculator class'ına extend et.. (uzat, bağla)
        //        super class'ın içindeki calculating methodunu Override et.
        //         iki parametreyi böl ve sonucu return et.
        //Multiply class'ının içinde,
        //         Calculator class'ına extend et.. (uzat, bağla)
        //        super class'ın içindeki calculating methodunu Override et.
        //         iki parametreyi çarp ve sonucu return et.
        //Substract class'ının içinde,
        //         Calculator class'ına extend et.. (uzat, bağla)
        //        super class'ın içindeki calculating methodunu Override et.
        //         iki parametreyi birbirinden çıkart ve sonucu return et.
        //Main class'ın içinde
        //         scanner object oluşturunuz.
        //         iki int oluştur ve bu iki int değişkenine scanner ata.
        //Sum methodu çağır ve sonucu yazdır.
        //Divide methodu çağır ve sonucu yazdır.
        //Multiply methodu çağır ve sonucu yazdır.
        //Substract methodu çağır ve sonucu yazdır.

        int secim = 0;
        do {

            menuyaz();
            secim = oku.nextInt();
            islemyap(secim);
            System.out.println();

        } while (secim != 5);


    }

    private static void islemyap(int secim) {
        switch (secim) {
            case 1:
                System.out.println("---Toplama İşlemi---");
                Sum sum = new Sum();
                System.out.print("ilk sayıyı giriniz=");
                int ilk = oku.nextInt();
                System.out.print("ikinci sayıyı giriniz=");
                int ikinci = oku.nextInt();
                System.out.println("Toplam=" + sum.calculating(ilk, ikinci));
                break;
            case 2:
                System.out.println("---Bölme İşlemi---");
                Divide dvd = new Divide();
                System.out.print("ilk sayıyı giriniz=");
                int ilk2 = oku.nextInt();
                System.out.print("ikinci sayıyı giriniz=");
                int ikinci2 = oku.nextInt();
                System.out.println("Bölüm=" + dvd.calculating(ilk2, ikinci2));
                break;
            case 3:
                System.out.println("---Çarpma İşlemi---");
                Multiply mlt = new Multiply();
                System.out.print("ilk sayıyı giriniz=");
                int ilk3 = oku.nextInt();
                System.out.print("ikinci sayıyı giriniz=");
                int ikinci3 = oku.nextInt();
                System.out.println("Çarpım=" + mlt.calculating(ilk3, ikinci3));
                break;
            case 4:
                System.out.println("---Çıkartma İşlemi---");
                Substract sbs = new Substract();
                System.out.print("ilk sayıyı giriniz=");
                int ilk4 = oku.nextInt();
                System.out.print("ikinci sayıyı giriniz=");
                int ikinci4 = oku.nextInt();
                System.out.println("Çıkartma=" + sbs.calculating(ilk4, ikinci4));
                break;
            case 5:
                System.out.println("ÇIKIŞ YAPILIYOR...");
                break;
            default:
                System.out.println("Geçerli Tuşlama Yapınız");
                break;


        }


    }

    private static void menuyaz() {
        System.out.println("1-toplama" + "\n" + "2-bölme" + "\n" + "3-Çarpma" + "\n" + "4-cıkartma" + "\n" +
                "5-cıkıs" + "\n" + "Seciminizi Giriniz = ");
    }
}
