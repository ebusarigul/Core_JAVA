package Udemy._03_Ornek;

public class soru {
    public static void main(String[] args) {

        System.out.println("toplama = " + HesapMakinesi.toplama(5,8,7,9,5,3,1,5) );
        System.out.println("cıkartma = " + HesapMakinesi.cikartma(45,6,8,7,2 ));
        System.out.println("carpma = " + HesapMakinesi.carpim(5,8,7,9) );
        System.out.println("bolme = " + HesapMakinesi.bolum(450,3,10,5) );


    }
}

class HesapMakinesi {
    public static int toplama(int... parametre) {
        int toplam = 0;
        for (int i = 0; i < parametre.length; i++) {
            toplam = toplam + parametre[i];
        }
        return toplam;
    }
    public static int cikartma(int...parametre){
        int cikan=parametre[0];
        for (int i = 1; i < parametre.length ; i++) {
            cikan=cikan-parametre[i];
        }
        return cikan;
    }
    public static int carpim(int...parametre){
        int carpim=1;
        for (int i = 0; i < parametre.length ; i++) {
            carpim=carpim*parametre[i];
        }
        return carpim;
    }
    public static double bolum(int...parametre){
        double bolum=parametre[0];
        for (int i = 1; i < parametre.length ; i++) {
            if (parametre[i] != 0 ){
                bolum=bolum/parametre[i];
            }else {
                System.out.println("sonuc yoktur");
            }
        }
        return bolum;
    }
}