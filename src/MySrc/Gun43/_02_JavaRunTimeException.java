package MySrc.Gun43;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Scanner oku = new Scanner(System.in);
            try {
                System.out.print("1. sayıyı giriniz = ");
                int sayi1 = oku.nextInt();

                System.out.print("2. sayıyı giriniz = ");
                int sayi2 = oku.nextInt();

                System.out.println("bolum = " + (sayi1 / sayi2));

            } catch (Exception hata) {
                System.out.println(hata.getMessage());
                i--;
            }

        }


    }
}
