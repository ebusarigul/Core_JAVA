package Udemy._02_Ornek;

public class soru {
    public static void main(String[] args) {
        //ogrenci isimli sınıf olusturun.bu sınıfta ogrencinin id si ve not degeri tutulmalı
        //100 elemanlı bir dizide id ve not degerlerini rastgele olusturarak bu
        // ogrencileri saklayın ve bu ogrencileri aldıkları notlara göre azalan sırada yazdıran
        //metodu yazın..

        Ogrenci[] tumogrenciler=new Ogrenci[100];

        for (int i = 0; i < tumogrenciler.length ; i++) {
            int idrandom=(int)(Math.random()*999);
            int notrandom=(int)(Math.random()*100);

            tumogrenciler[i].id=idrandom;
            tumogrenciler[i].notdegeri=notrandom;
        }


    }
}
class Ogrenci {
    int notdegeri;
    int id;
    Ogrenci[] tumogrenciler;


}