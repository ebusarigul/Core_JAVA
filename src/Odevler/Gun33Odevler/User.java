package Odevler.Gun33Odevler;

public class User {

    private final int id;
    private String username;
    private String password;
    static boolean active = true;
    static boolean signedIn = true;
    private userRole userRole;

    static int sayac = 0;

    public User(String username, String password, boolean active, boolean signedIn, Odevler.Gun33Odevler.userRole userRole) {
        this.id = ++sayac;
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public Odevler.Gun33Odevler.userRole getUserRole() {
        return userRole;
    }

    public void setUserRole(Odevler.Gun33Odevler.userRole userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "ROLÜ = " + userRole + " ID = " + id + " userName = " + username +
                " sifre = " + password + " aktif mi=" + active + " giris yapıldı mı =" + signedIn;
    }
}
