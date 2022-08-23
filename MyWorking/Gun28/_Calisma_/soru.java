package Gun28._Calisma_;

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

        Lesson ders1 = new Lesson("mat101", 4);
        Lesson ders2 = new Lesson("java101", 3);
        Lesson ders3 = new Lesson("Soft Skills", 4);
        Lesson ders4= new Lesson("Python 101",5);

        ArrayList<Lesson> dersliste = new ArrayList<>();
        dersliste.add(ders1);
        dersliste.add(ders2);
        dersliste.add(ders3);
        dersliste.add(ders4);

        Student ogr1 = new Student("Ebubekir", 10, dersliste);

        ogr1.kreditopla(dersliste);


    }
}
