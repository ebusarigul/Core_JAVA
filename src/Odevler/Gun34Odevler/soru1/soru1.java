package Odevler.Gun34Odevler.soru1;

public class soru1 {
    public static void main(String[] args) {
        //-1-//Burada iki adet class vardır. Biri **Main**, diğeri ise **student ,**
        //**student classı içinde;**
        //String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.
        //getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.
        //**Main classın içinde**;
        //Örnek:
        //**age 12**'dir.
        //**name Steven**'dır.
        //name(isim) olarak;
        //**"Student name is Steven"**
        //ve
        //age(yaş) olarak da;
        //"He is 12 years old"

        Student ogr1 = new Student("Ebubekir", 23);

        ogr1.infowrite();


    }
}
