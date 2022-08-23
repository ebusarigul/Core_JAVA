package Gun30.soru;

public class Musteri {
    int hesapid;
    static String name;
    static String surname;
    Hesap musterihesap;

    public Musteri(int hesapid, String name, String surname, Hesap musterihesap) {
        this.hesapid = hesapid;
        this.name = name;
        this.surname = surname;
        this.musterihesap = musterihesap;
    }
}
