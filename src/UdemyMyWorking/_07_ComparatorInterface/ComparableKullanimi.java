package UdemyMyWorking._07_ComparatorInterface;

import java.util.Arrays;

public class ComparableKullanimi {
    public static void main(String[] args) {

        Student student1=new Student(5,"ebu");
        Student student2=new Student(3,"hasan");
        Student student3=new Student(7,"ayse");

        Student [] ogrenciler={student1,student2,student3};

        System.out.println("dizi sıralanmadan önceki hali");
        for (Student s : ogrenciler){
            System.out.println(s);

        }

        Arrays.sort(ogrenciler);
        System.out.println("dizi sıralandıktan sonraki hali");
        for (Student s : ogrenciler){
            System.out.println(s);
        }



    }
}
class Student implements Comparable<Student>{
    int id;
    String ad;

    public Student(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "ad:"+ad+" id:"+id;
    }

    @Override
    public int compareTo(Student o) {
        /* if (this.id < o.id){
            return -1;
        } else if (this.id > o.id) {               // id nosuna göre sıraladı
            return 1;
        }else return 0;*/

        if (this.ad.compareTo(o.ad) < 0){
            return -1;
        }else if (this.ad.compareTo(o.ad) > 0){    // isme göre sıraladık
            return 1;
        }else {
            return 0;
        }

    }
}