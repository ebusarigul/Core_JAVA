package UdemyMyWorking._12_VeterinerBirligi;

public class Kopek extends Hayvan{

    private int asisayisi;
    private String tur;
    private String cins;

    public Kopek(String dogumTarihi, boolean kayitli,int asisayisi,String cins) {
        super(dogumTarihi, kayitli);
        this.asisayisi=asisayisi;
        this.cins=cins;
        this.tur="kopek";
    }

    @Override
    void bigileriGoster() {

        System.out.println(toString() + " " + super.toString());
    }

    public int getAsisayisi() {
        return asisayisi;
    }

    public void setAsisayisi(int asisayisi) {
        this.asisayisi = asisayisi;
    }

    @Override
    public String toString() {
        return "Kopek{" +
                "asisayisi=" + asisayisi +
                ", tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
