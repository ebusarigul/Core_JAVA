package Udemy._01_Ornek;

public class soru1 {
    public static void main(String[] args) {
        // cemberdaire isimli sınıf olusturun. bu sınıfın yarıcap bilgisi alan kurucusu olmalı
        // ayrıca cevre ve alanı hesaplayan metotlar olmalı.


        cemberdaire yenicember = new cemberdaire();
        yenicember.yaricap = 5;

        yenicember.cevrehesapla(yenicember.yaricap);
        yenicember.alanhesapla(yenicember.yaricap);


    }
}

class cemberdaire {
    int yaricap;
    double pi = 3.14;

    public double cevrehesapla(int yaricap) {
        double cevre = 2 * pi * yaricap;
        System.out.println("cevre = " + cevre);
        return cevre;
    }

    public double alanhesapla(int yaricap) {
        double alan = pi * yaricap * yaricap;
        System.out.println("alan = " + alan);
        return alan;
    }
}