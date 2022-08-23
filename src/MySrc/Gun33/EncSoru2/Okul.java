package MySrc.Gun33.EncSoru2;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    public static int maxOgrenciSayisi=3;
    static ArrayList<Ogrenci> ogrenciler;

    public Okul(String okulAd, ArrayList<Ogrenci> ogrenciler) {
        this.okulAd = okulAd;
        this.ogrenciler = ogrenciler;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }


}
