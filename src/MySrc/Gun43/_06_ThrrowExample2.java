package MySrc.Gun43;

import java.util.Scanner;

public class _06_ThrrowExample2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("yeni kullanıcı ve sifre giriniz");
        System.out.println("kullanıcı adı giriniz = ");
        String usertname = oku.nextLine();

        System.out.println("sifre giriniz = ");
        String password = oku.nextLine();

        try {

            if (password.length() < 8) {
                throw new Exception("sifre 8 karakterden az olamaz");
            }
            if (password.length() > 15) {
                throw new Exception("sifre 15 karakterden fazla olamaz");
            }

        } catch (Exception ex) {
            System.out.println("Lütfen Dikkat");
            System.out.println("Uyarı = " + ex.getMessage());
        }


    }
}
