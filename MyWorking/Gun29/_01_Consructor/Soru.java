package Gun29._01_Consructor;

public class Soru {
    public static void main(String[] args) {

        //// Bir Student sınıfı oluşturunuz (id, name, surName, classroom(int)) ve
        //    // bundan 7 adet öğrenci oluşturunuz.

        Student ogr1 = new Student(123, "Ebu", "Sarıgül", 12);
        Student ogr2 = new Student(45, "hasan", "bas", 7);
        Student ogr3 = new Student(456, "zeynel", "tosun", 11);
        Student ogr4 = new Student(741, "zeynep", "kucuk", 9);
        Student ogr5 = new Student(221, "fatih", "Sarıgül", 12);
        Student ogr6 = new Student(54, "erkan", "bas", 8);
        Student ogr7 = new Student(712, "zehra", "varlı", 4);

        Student.bilgileriYazdir(ogr1);
        Student.bilgileriYazdir(ogr2);
        Student.bilgileriYazdir(ogr3);
        Student.bilgileriYazdir(ogr4);
        Student.bilgileriYazdir(ogr5);
        Student.bilgileriYazdir(ogr6);
        Student.bilgileriYazdir(ogr7);

    }
}

class Student {
    int no;
    String name;
    String surname;
    int sinif;

    public Student(int no, String name, String surname, int sinif) {
        this.no = no;
        this.name = name;
        this.surname = surname;
        this.sinif = sinif;
    }

    public static void bilgileriYazdir(Student ogr) {
        System.out.println(ogr.name + " " + ogr.surname + " " + ogr.no + " " + ogr.sinif);
    }

}
