package Odevler;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.println("ögrenci sayisi giriniz = ");
        int ogrSayisi= oku.nextInt();
        System.out.println("soru sayisi giriniz = ");
        int soruSayisi= oku.nextInt();

        char [][] tablo=new char[ogrSayisi][soruSayisi];
        String[] ogrenciler = {"Ebu", "Mert", "Hakan","Cengiz"};
        char [] dogruCevaplar=new char[soruSayisi];

        tabloDoldur(tablo,ogrenciler);
        cevaplariOlustur(dogruCevaplar);
        notHesapla(tablo,dogruCevaplar);


    }

    private static void notHesapla(char[][] tablo, char[] dogruCevaplar) {
        for (int i = 0; i < tablo.length ; i++) {
            int dogru=0;int yanlis=0;double not=0;
            for (int j = 0; j <tablo[i].length ; j++) {
                if (tablo[i][j]==dogruCevaplar[j]){
                    dogru++;
                }else {
                    yanlis++;
                }
                not=((100.0/tablo[i].length)*dogru);
            }
            System.out.println(i + 1+". öğrencinin dogru sayisi= "+ dogru +" yanlıs sayisi= "+yanlis+" notu="+not);
        }
    }

    private static void cevaplariOlustur(char[] dogruCevaplar) {
        for (int i = 0; i < dogruCevaplar.length ; i++) {
            dogruCevaplar[i]=cevapOlustur();
        }

    }

    private static void tabloDoldur(char[][] tablo,String[] ogrenciler) {
        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0; j <tablo[i].length ; j++) {
                tablo[i][j]=cevapOlustur();

            }
        }
    }

    private static char cevapOlustur() {

        int random = (int)((Math.random()*5)+65);
        char cevap= (char) random;
        return cevap;
    }
}
