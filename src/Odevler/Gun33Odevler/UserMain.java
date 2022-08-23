package Odevler.Gun33Odevler;
import MySrc.Gun33.EncSoru2.Ogrenci;
import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        // 1- filedları id, username, password, active (boolean),
        // signedIn (boolean), userRole(ADMIN, OGRENCI, CALISAN, HOCA)
        //    olan User isimli bir class tanımlayınız.
        // 2- bütün fieldları parametre alan bir concructor tanımlayınız.
        // 3- bütün fieldları için getter ve setter metodları oluşturunuz.
        // 4- UserMain isminde main için bir class oluşturunuz.
        // 5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
        //    active ve signedIn default olarak true veya false atayabilirsiniz.
        //    id yi sistem otomatik versin.,
        // 6- eğer password 6 dan küçük olursa yeniden istesin.passwordun
        //    6 karakterden küçük olup olmadığını (classın içinde) kontrol ediniz.

        Scanner oku = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.print("kullanıcı adı giriniz = ");
            String kullaniciadi = oku.nextLine();
            System.out.print("sifre giriniz = ");
            String sifre = oku.nextLine();
            while (sifre.length() < 6) {
                System.out.println("sifreniz 6 karakterden uzun olmalı");
                System.out.print("yeni sifre giriniz = ");
                sifre = oku.nextLine();
                if (sifre.length() >= 6) {
                    break;
                }
            }
            System.out.print("rolunuzu giriniz = ");
            userRole role = userRole.valueOf(oku.nextLine());
            User.active = true;
            User.signedIn = true;

            users.add(new User(kullaniciadi, sifre, User.active, User.signedIn, role));

        }
        for (int i = 0; i < users.size() ; i++) {
            System.out.println(users.get(i));
        }

    }
}
