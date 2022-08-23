package Gun28._03_Soru;

import java.util.ArrayList;

public class Soru {
    public static void main(String[] args) {
        // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
        // 1- Ders Class : adı: Lesson , fields : name, credit (1-10 arasında değer alıyor)
        // 2- Öğrenci Class: adı: Student, fields : name, maxCredit, dersleri listesini
        //    tutacak bir liste
        // 3- 3 adet ders oluşturunuz.
        // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
        // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
        //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
        //    uyarı versi, alabileceğiniz max credi doldu şeklinde.

        Lesson ders1=new Lesson("mat",5);
        Lesson ders2=new Lesson("fizik",1);
        Lesson ders3=new Lesson("kimya",3);

        Student ogr1=new Student();
        ogr1.ogrname="Ebubekir Sarıgül";
        ogr1.maxcredit=10;


        ArrayList<Lesson> derslistesi=new ArrayList<>();
        derslistesi.add(ders1);
        derslistesi.add(ders2);
        derslistesi.add(ders3);
        System.out.println(ogr1.ogrname+" adlı ögrencinin aldıgı kredi miktarı = " + Student.kreditoplam(derslistesi));

        Student.kreditoplam(derslistesi);









    }
}