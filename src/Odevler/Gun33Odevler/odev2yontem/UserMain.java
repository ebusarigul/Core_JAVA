package Odevler.Gun33Odevler.odev2yontem;

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
        ArrayList<User> userlist = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            User user = new User();

            System.out.print("kullanıcı adı giriniz = ");
            user.setUsername(oku.nextLine());
            System.out.print("sifre giriniz = ");
            user.setPassword(oku.nextLine());
            System.out.print("Rolünüzü giriniz = ");
            user.setRol(UserRole.valueOf(oku.nextLine()));

            userlist.add(user);
        }
        for (int i = 0; i < userlist.size(); i++) {
            System.out.println(userlist.get(i));

        }
    }
}
