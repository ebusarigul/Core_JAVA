package Gun28._03_calisma;

import java.util.ArrayList;

public class soru {
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


        Lesson drs1=new Lesson("mat101",1);
        Lesson drs2=new Lesson("Java101",5);
        Lesson drs3=new Lesson("SoftSkills",3);

        Student ogr1=new Student();
        ogr1.ogrname="Ebubekir Sarıgül";
        ogr1.maxcredit=10;


        ArrayList<Lesson> dersler=new ArrayList<>();
        dersler.add(drs1);dersler.add(drs2);dersler.add(drs3);

        Student.kreditopla(dersler);




















    }
}
