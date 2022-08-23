package MySrc.Gun40._01_;

public abstract class Hayvan {

    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    static int sayac=0;

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id = ++sayac;
        this.isim = isim;
        this.vahsi = vahsi;
        this.dogumTarihi = dogumTarihi;
    }

    abstract String yiyecegi();
    abstract int yemekMiktari();
    abstract int gunlukUykusuresi();
    abstract String sesi();

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }



    @Override
    public String toString() {
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}
