package Gun35._02_KalıtımOrnek;

public class Sekil {
    private int alan;
    private int cevre;

    public Sekil() {
    }

    public Sekil(int alan, int cevre) {
        this.alan = alan;
        this.cevre = cevre;
    }

    public int getAlan() {
        return alan;
    }

    public void setAlan(int alan) {
        this.alan = alan;
    }

    public int getCevre() {
        return cevre;
    }

    public void setCevre(int cevre) {
        this.cevre = cevre;
    }
}

class Daire extends Sekil{
    private int yaricap;

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    public Daire(int alan, int cevre, int yaricap) {
        super(alan, cevre);
        this.yaricap = yaricap;
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }
    public void alanBul(){
        double alan=Math.PI*yaricap*yaricap;
        System.out.println("Daire alan = " + alan);
    }
    public void cevreBul(){
        double cevre=2*yaricap*Math.PI;
        System.out.println("Daire cevre = " + cevre);
    }
}

class Dikdortgen extends Sekil{
    private int uzunluk;
    private int genislik;

    public Dikdortgen(int uzunluk, int genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    public Dikdortgen(int alan, int cevre, int uzunluk, int genislik) {
        super(alan, cevre);
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }
    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }
    public int alanBul(){
        int alan=uzunluk*genislik;
        System.out.println("Dikdörtgen alan = " + alan);
        return alan;
    }
    public int cevreBul(){
        int cevre=(uzunluk+genislik)*2;
        System.out.println("Dikdörtgen cevre = " + cevre);
        return cevre;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                '}';
    }
}



