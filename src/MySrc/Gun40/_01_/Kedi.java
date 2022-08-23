package MySrc.Gun40._01_;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    String yiyecegi() {
        return "kedi maması";
    }

    @Override
    int yemekMiktari() {
        return 3;
    }

    @Override
    int gunlukUykusuresi() {
        return 8;
    }

    @Override
    String sesi() {
        return "miyav miyav";
    }
}
