package Udemy;

public class Encapsulation {
    public static void main(String[] args) {
       /*
        Ogrenci ogr1=new Ogrenci(50,"ebu", (byte) 12,true);
        ogr1.ogrenciBilgileriniyazdir();
        ogr1.setOgrenciNo(456);
        ogr1.ogrenciBilgileriniyazdir();
        System.out.println("ogrenci no = "+ ogr1.getOgrenciNo());
        ogr1.setIsim("yeni isim");
        ogr1.ogrenciBilgileriniyazdir();
*/

        Televizyon tv=new Televizyon();
        tv.ac();
        tv.setSesseviyesi(15);
        tv.setKanal(600);
        tv.kapat();

        tv.goster();





    }
}
