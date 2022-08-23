package Odevler.Mentoring;

public class Calisan extends Member{
    String specialization;

    public Calisan(String name, int age, int phoneNumber, String adress, int salary,String specialization) {
        super(name, age, phoneNumber, adress, salary);
        this.specialization=specialization;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"specialization="+specialization;
    }
}
