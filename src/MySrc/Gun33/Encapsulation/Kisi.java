package MySrc.Gun33.Encapsulation;

public class Kisi {
    private String ad;
    private String soyad;
    private int yas;

    public Kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        setYas(yas);
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            this.yas = -1 * yas;
        } else {
            this.yas = yas;
        }
    }

    @Override
    public String toString() {
        return "adı = "+ad + " soyad = "+soyad + " yası = "+yas ;
    }
}
