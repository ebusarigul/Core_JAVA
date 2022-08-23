package Gun27._01_ornek;

public class Ornek {
    public static void main(String[] args) {

        //1-adım : Person isimli bir class tanımlayınız : name,surname,age,
        //2-adım : mainde iki tane bu sınıftan nesne olusturup deger atayınız
        //3.adım : bu degerleri yazdırınız.
        //4.adım : getbirtfay year isminde persona ait
        //       : calıstıgında doğum yılını versin.
        // 5- Adım : getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        Person kisi1 = new Person();
        kisi1.name = "Ebubekir";
        kisi1.surname = "Sarıgül";
        kisi1.age = 24;

        kisi1.bilgileryazdir();
        kisi1.getBirthday(kisi1.age);

        Person kisi2 = new Person();
        kisi2.name = "Mahmut";
        kisi2.surname = "Irmak";
        kisi2.age = 42;

        kisi2.bilgileryazdir();
        kisi2.getBirthday(kisi2.age);

        kisi1.getInitials();
        kisi2.getInitials();


        Person kisi3 = new Person("Ebubekir", "Sarigul", 45);
        kisi1.bilgileryazdir();

        Person kisi4 = new Person("Mahmut", "Irmak", 42);
        kisi2.bilgileryazdir();


    }
}
