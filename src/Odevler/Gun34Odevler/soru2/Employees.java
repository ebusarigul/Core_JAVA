package Odevler.Gun34Odevler.soru2;

public class Employees {
    private String name;
    private int salary;
    private String dob;

    public Employees(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Name is "+name+"\n"
                +"Salary is "+salary+"\n"
                +"dob is "+dob;
    }
}
