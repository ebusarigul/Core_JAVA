package UdemyMyWorking._12_VeterinerBirligi;

public class Kedi extends Hayvan{

    private String tur;
    private String cinsi;

    public Kedi(String dogumTarihi, boolean kayitli,String cinsi) {
        super(dogumTarihi, kayitli);
        this.tur="kedi";
        this.cinsi=cinsi;
    }

    @Override
    void bigileriGoster() {
        System.out.println(toString() + " kayıtlı mı= "+isKayitli()+ " dogum tarihi = "+ getDogumTarihi());

    }

    @Override
    public String toString() {
        return "Kedi{" +
                "tur='" + tur + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
