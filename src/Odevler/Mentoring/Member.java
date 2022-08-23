package Odevler.Mentoring;

public class Member {
    private String name;
    private int age;
    private int phoneNumber;
    private String adress;
    private int salary;

    public Member(String name, int age, int phoneNumber, String adress,int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.salary=salary;
    }

    public void printSalary(){
        System.out.println("Maaş="+salary);
    }

    @Override
    public String toString() {
        return "name=" + name + "\n" +
                "age=" + age + "\n" +
                "phoneNumber=" + phoneNumber + "\n" +
                "adress=" + adress + "\n" +
                "salary=" + salary;
    }
}
