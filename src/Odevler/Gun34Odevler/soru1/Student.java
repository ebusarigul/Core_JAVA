package Odevler.Gun34Odevler.soru1;

public class Student {
    private String name;
    private int yas;

    public Student() {
    }

    public Student(String name, int yas) {
        this.name = name;
        this.yas = yas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void infowrite() {
        System.out.println("Student name is " + name);
        System.out.println("He is " + yas + " years old");
    }
}
