package Odevler.Mentoring;

public class Yonetici extends Member{

    String departmant;

    public Yonetici(String name, int age, int phoneNumber, String adress, int salary,String departmant) {
        super(name, age, phoneNumber, adress, salary);
        this.departmant=departmant;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"departman="+departmant;
    }
}
