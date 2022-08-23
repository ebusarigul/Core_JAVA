package MySrc.Gun39._01_;

public abstract class BinekOto {

    private String marka;
    private int uretimYili;
    private int vitesAdedi;


    //implemente edilmek zorunda
    public abstract String getMarka();

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}


