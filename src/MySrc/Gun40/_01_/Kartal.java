package MySrc.Gun40._01_;

public class Kartal extends  Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    String yiyecegi() {
        return "yılan";
    }

    @Override
    int yemekMiktari() {
        return 3;
    }

    @Override
    int gunlukUykusuresi() {
        return 6;
    }

    @Override
    String sesi() {
        return "sesi yok";
    }
}
