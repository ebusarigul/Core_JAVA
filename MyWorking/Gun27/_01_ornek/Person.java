package Gun27._01_ornek;

public class Person {
    String name;
    String surname;
    int age;


    public Person(){

    }

    public Person(String name,String surname,int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    public void bilgileryazdir(){
        System.out.println("adı= "+name+" soyadı="+surname+ " yası="+age);
    }
    public int getBirthday(int age){
        int dogumyili=2022-age;
        System.out.println("dogumyili = " + dogumyili);
        return dogumyili;
    }
    public void getInitials(){
        System.out.println(name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0)+".");

    }
}
