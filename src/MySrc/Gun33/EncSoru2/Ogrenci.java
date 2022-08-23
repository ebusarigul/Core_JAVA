package MySrc.Gun33.EncSoru2;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int yas;

    final int id;

    static int sayac=0;


    public Ogrenci(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.id=++sayac;

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
        this.yas=yas;
    }

    @Override
    public String toString() {
        return " ad="+ad + " soyad="+soyad + " yas="+yas + " id="+id;
    }

}
