package Odevler.Gun38Odevler.soru4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner oku = new Scanner(System.in);

    public static void main(String[] args) {
        //4-
        //deliveryOptions  class interface'i (arayüz) yap.
        //3 tane method oluşturun.
        //birinci methodun ismi getTheTotal parametresi String arraylist, return type'ı int.
        //ikinci methodun ismi isFreeShipping  parametresi String arraylist, return type'ı String.
        //iki tane int oluşturun.
        //ilki AmazonMinFreeDelivery = 10000
        //ikincisi CostcoMinFreeDelivery =  15000
        //Amazon class'ının içinde
        //getTotal method'unun içinde 3 tane bunun gibi Stirng vardır.  $3K , $200 , $1K
        //String'leri int yapınız ve toplam sayıya return ediniz.
        // not: sonunda K olan sayılar 1000 ile çarpılır.
        //isFreeShipping  methodunun içinde
        // Eğer toplam sayı AmazonMinFreeDelivery'den yüksekse "you are eligible for free delivery" yadırınız.
        //Eğer toplam sayı AmazonMinFreeDelivery'den düşük ise "you need to buy ..... amount of item." yazdrınız.
        //Costco  class'ının içinde
        //getTotal'ı ve deliveryOptions interface'indeki isFreeShipping methodunu override edin.
        //getTotal methodunun içinde bunun gibi Stringler vardır. $3K , $200 , $1K
        //Stirng'leri int yapın ve toplam sayıya return edin.
        //not: sonunda K olan sayılar 1000 ile çarpılır.
        //isFreeShipping  methodunun içinde;
        //Eğer toplam sayı CostcoMinFreeDelivery'dan yüksekse "Print you are eligible for free delivery" yazdırınız.
        //Eğer toplam sayı CostcoMinFreeDelivery 'dan düşükse "print you need to buy ..... amount of item." yazdırınız.
        //main method'un içinde
        //iki tane objects oluşturun.
        //Biri Amazon class'ı için
        //Diğeri costco classı için.
        //amazon class'ının içinde isFreeShipping'i çağırın ve sonucu yazdırın.
        //costco class'ının içinde isFreeShipping'i çağırın ve sonucu yazdırın.

        ArrayList<String> getthetotals = new ArrayList<>();
        Amazon amz = new Amazon();
        for (int i = 0; i < 3; i++) {

            System.out.print(i + 1 + ". Amazon harcamanızı giriniz = ");
            getthetotals.add(oku.nextLine());

        }
        System.out.println("Amazon Total Spend= " + amz.getTheTotal(getthetotals) + "$");
        System.out.println("Is Shipping Free= " + amz.isFreeShipping(getthetotals));

        System.out.println();

        ArrayList<String> cstgetthetotals = new ArrayList<>();
        Costco cst = new Costco();
        for (int i = 0; i < 3; i++) {

            System.out.print(i + 1 + ". Costco harcamanızı giriniz = ");
            cstgetthetotals.add(oku.nextLine());

        }
        System.out.println("Costco Total Spend= " + cst.getTheTotal(cstgetthetotals) + "$");
        System.out.println("Is Shipping Free= " + cst.isFreeShipping(cstgetthetotals));


    }
}
