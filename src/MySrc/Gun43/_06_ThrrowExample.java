package MySrc.Gun43;

import java.util.Scanner;

public class _06_ThrrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("yeni kullanıcı ve sifre giriniz");
        System.out.println("kullanıcı adı giriniz = ");
        String usertname= oku.nextLine();

        System.out.println("sifre giriniz = ");
        String password= oku.nextLine();

        if (password.length() < 8){
            System.out.println("Lütfen Dikkat");
            System.out.println("sifre 8 karakterden az olamaz");
        }
        if (password.length() > 15){
            System.out.println("Lütfen Dikkat");
            System.out.println("sifre 15 karakterden fazla olamaz");
        }









    }
}
