package MySrc.Gun34._02_Ornek;

public class soru {
    public static void main(String[] args) {

        Hayvan hayvan = new Hayvan();
        hayvan.konustu();


        Kopek dog = new Kopek("beyaz", "15", "pomernian", 4);
        System.out.println("dog = " + dog);

        dog.konustu();


    }
}

class Hayvan {
    private String renk;
    private String kilo;
    private String cins;

    public Hayvan() {
    }

    public Hayvan(String renk, String kilo, String cins) {
        this.renk = renk;
        this.kilo = kilo;
        this.cins = cins;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKilo() {
        return kilo;
    }

    public void setKilo(String kilo) {
        this.kilo = kilo;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public void konustu() {
        System.out.println("hayvan konustu");
    }

}

class Kopek extends Hayvan {
    private final int ayaksayisi;

    public Kopek(String renk, String kilo, String cins, int ayaksayisi) {
        super(renk, kilo, cins);
        this.ayaksayisi = ayaksayisi;
    }

    public void konustu() {
        super.konustu();
        System.out.println("köpek hav hav dedi");
    }

    @Override
    public String toString() {
        return " rengi=" + getRenk() + " kilo=" + getKilo() + " cinsi=" + getCins() + " ayak sayısı=" + ayaksayisi;
    }
}