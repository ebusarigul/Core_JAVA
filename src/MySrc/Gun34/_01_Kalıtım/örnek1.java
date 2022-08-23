package MySrc.Gun34._01_Kalıtım;

public class örnek1 {
    public static void main(String[] args) {

        Yonetim yonetici = new Yonetim();
        yonetici.maasYazdir();
        yonetici.zamyap();


    }
}

class Personel {

    private final int id;

    private String ad;
    private String soyad;
    private int yas;

    public static int sayac = 0;

    public Personel() {
        this.id = ++sayac;
    }

    public Personel(String ad, String soyad, int yas) {
        this.id = ++sayac;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void zamyap() {
        System.out.println("zam yapıldı");
    }
}

class Yonetim extends Personel {
    private int maas;

    public Yonetim() {
    }

    public Yonetim(String ad, String soyad, int yas, int maas) {
        super(ad, soyad, yas);
        this.maas = maas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public void maasYazdir() {
        System.out.println("personel sınıfı calıstı");
    }
}
