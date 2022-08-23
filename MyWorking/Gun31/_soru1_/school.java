package Gun31._soru1_;

public class school {
    public static void main(String[] args) {
        // Vatandas (name, tcNO)
        // Yukarıdaki gibi 5 öğrenci tanımlayınız.
        // Her öğrencinin takip eden bir id si olmalı.
        // Ve en son kaç öğrenci olduğunu bulabilmeliyim.

        Student og1 = new Student("ebubekir", "sarıgül");
        Student og2 = new Student("havva", "erkan");
        Student og3 = new Student("yılmaz", "sahin");
        Student og4 = new Student("ediz", "tarhan");
        Student og5 = new Student("ibrahim", "kara");

        System.out.println(og1);
        System.out.println(og2);
        System.out.println(og3);
        System.out.println(og4);
        System.out.println(og5);

        System.out.println("toplam ogrenci sayısı = " + Student.sayac);

    }
}

class Student {
    private String name;
    private String surname;
    private int id;
    static int sayac = 0;

    public Student(String name, String surname) {
        this.id = sayac++;
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}