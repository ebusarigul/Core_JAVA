package MySrc.Gun36._02_PolimorfismSoru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        setAd(ad);
        setSoyad(soyad);
        setGorev(gorev);
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

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public static void kimlikbelgesi(Kisi kisi) {
        System.out.println("girilen kisinin kimlik bilgileri");
        if (kisi instanceof Ogrenci) {
            System.out.println("isim=" + kisi.getAd() + " soyad=" + kisi.getSoyad()
                    + " gorev=" + kisi.getGorev() + " sube=" + ((Ogrenci) kisi).getSube());
        } else if (kisi instanceof Calisan) {
            System.out.println("isim=" + kisi.getAd() + " soyad=" + kisi.getSoyad()
                    + " gorev=" + kisi.getGorev() + "  departman=" + ((Calisan) kisi).getDepartman());

        }
    }

}

