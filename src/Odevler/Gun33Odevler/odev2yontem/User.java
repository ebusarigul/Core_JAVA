package Odevler.Gun33Odevler.odev2yontem;

import java.util.Scanner;

public class User {

    private final int id;

    private String username;
    private String password;
    static boolean active = true;
    static boolean signedIn = true;
    private UserRole rol;

    static int sayac = 0;

    public User() {
        this.id = ++sayac;
    }

    public User(int id, String username, String password, UserRole rol) {
        this.id = ++sayac;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        Scanner oku = new Scanner(System.in);
        while (password.length() < 6) {
            System.out.println("sifreniz 6 karakterden kısa olamaz");
            System.out.print("yeni sifre giriniz = ");
            password = oku.nextLine();
            if (password.length() >= 6) {
                break;
            }
        }
        this.password = password;
    }

    public void setRol(UserRole rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "ID = " + id + "  Rolü=" + rol + "  UserName= " + username
                + "  Password= " + password + "  Aktif Mi=" + active + "  Giris Yapıldı Mı=" + signedIn;
    }
}
