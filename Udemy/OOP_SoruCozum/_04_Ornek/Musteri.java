package Udemy._04_Ornek;

public class Musteri {
    private String musteriname;
    ElektrikHesabi hesap;

    public Musteri(String musteriname, ElektrikHesabi hesap) {
        this.musteriname = musteriname;
        this.hesap = hesap;
    }

    public String getMusteriname() {
        return musteriname;
    }

    public void setMusteriname(String musteriname) {
        this.musteriname = musteriname;
    }
}
