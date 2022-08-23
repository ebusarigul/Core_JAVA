package Gun27._02_ornek;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
    //// 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
        //    // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
        //    // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.

        Rectangle dikdortgen=new Rectangle();
        Scanner oku=new Scanner(System.in);
        System.out.println("kısa kenar giriniz = ");
        dikdortgen.width= oku.nextInt();

        System.out.println("uzun kenar giriniz = ");
        dikdortgen.length= oku.nextInt();

        dikdortgen.cevre(dikdortgen.width, dikdortgen.length);
        dikdortgen.alan(dikdortgen.width, dikdortgen.length);

    }
}
