package UdemyMyWorking._12_VeterinerBirligi;

public abstract class Hayvan {

    private String dogumTarihi;
    private boolean kayitli;

    public Hayvan(String dogumTarihi, boolean kayitli) {
        this.dogumTarihi = dogumTarihi;
        this.kayitli = kayitli;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public boolean isKayitli() {
        return kayitli;
    }

    public void setKayitli(boolean kayitli) {
        this.kayitli = kayitli;
    }

    abstract void bigileriGoster();

    @Override
    public String toString() {
        return "Hayvan{" +
                "dogumTarihi='" + dogumTarihi + '\'' +
                ", kayitli=" + kayitli +
                '}';
    }
}
