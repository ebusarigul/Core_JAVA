package Odevler.Gun35Odevler;

public class Person {
    private String isim;
    private String adres;
    private String okul;
    private UyeTipi uyeTipi;

    public Person(String isim, String adres, String okul, UyeTipi uyeTipi) {
        this.isim = isim;
        this.adres = adres;
        this.okul = okul;
        this.uyeTipi = uyeTipi;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getAdres() {
        return adres;
    }
    public String getOkul() {
        return okul;
    }
    public void setOkul(String okul) {
        this.okul = okul;
    }
    public UyeTipi getUyeTipi() {
        return uyeTipi;
    }
}
class Calisan extends Person{

    private int maas;

    public Calisan(String isim, String adres, String okul, UyeTipi uyeTipi,int maas) {
        super(isim, adres, okul, uyeTipi);
        this.maas=maas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return " isim="+getIsim()+" adres="+getAdres()+" okul="+getOkul()
                +" uyetipi="+getUyeTipi()+" maaş="+maas;
    }
}
class Ogrenci extends Person{
    private String ucret;

    public Ogrenci(String isim, String adres, String okul, UyeTipi uyeTipi,String ucret) {
        super(isim, adres, okul, uyeTipi);
        this.ucret=ucret;
    }

    public String getUcret() {
        return ucret;
    }

    public void setUcret(String ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return " isim="+getIsim()+" adres="+getAdres()+" okul="+getOkul()
                +" uyetipi="+getUyeTipi()+" ücret="+ucret;
    }
}
