package Odevler.Gun34Odevler.soru2;

public class soru2 {
    public static void main(String[] args) {
        //2//Burada iki adet class vardır. Biri Main diğeri ise Employees,
        //**Employees(Çalışanlar) class'ında;**
        //Bu variable'ları oluşturunuz;
        //private String name,
        //private int salary,
        //private String dob (date of birth) (Doğum tarihi)
        //getter ve setter oluşturunuz.
        //**Main class'ın içinde;**
        //_Örnek:_
        //_Name is Fernando_
        //_Salary is 80000_
        //_dob is 11/23/2000_
        //**main method'un içinde,**
        //Eğer employee 18 yaşında büyükse, **Welcome to our company Fernando your salary is 80000.** yazdırınız.
        //Eğer Fernando 18 yaşından küçükse, **come back when you are 18 years old.** yazdırınız.
        //Eğer Fernando 18 yaşındaysa,  **we can have inter with you after that you can have a 80000 salary** yazdırınız.
        //ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age

        Employees emp = new Employees("Ebubekir", "24/10/1999");

        if (ageCalculator(emp)>18){
            System.out.println("Welcome to our company "+emp.getName()+" your salary is 80.000 $");
            emp.setSalary(80000);
        } else if (ageCalculator(emp)<18) {
            System.out.println("come back when you are 18 years old");
            emp.setSalary(0);
        }else {
            System.out.println("we can have inter with you after that you can have a 80000 salary");
        }

        System.out.println(emp);


    }

    public static int ageCalculator(Employees emp) {
        int yas = 2022 - Integer.parseInt(emp.getDob().substring(6));
        System.out.println("Age is "+yas);
        return yas;
    }
}

