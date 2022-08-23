package UdemyMyWorking._04_Abstract;

public class SoyutSinifKavrami {
    public static void main(String[] args) {

        GeometrikSekil kare = new Kare(12);
        kare.cevreHesapla();
        kare.alanHesapla();

        ((Kare) kare).adiniSoyle();

        GeometrikSekil dikdortgen = new Dikdortgen(10, 12);
        dikdortgen.cevreHesapla();
        dikdortgen.alanHesapla();
        ((Dikdortgen) dikdortgen).adiniSoyle();

        GeometrikSekil daire = new Daire(5);
        daire.cevreHesapla();
        daire.alanHesapla();

        alanlariKarsilastir(kare,dikdortgen);




    }
    public static void alanlariKarsilastir(GeometrikSekil gs1,GeometrikSekil gs2){

        if (gs1.getHesaplananAlan() < gs2.getHesaplananAlan()){
            System.out.println("birinci paramatredeki nesnenin alanı ikinciden küçük");
        } else if (gs1.getHesaplananAlan() > gs2.getHesaplananAlan()) {
            System.out.println("birinci paramatredeki nesnenin alanı ikinciden büyük");
        }else {
            System.out.println("iki alan birbirine eşittir");
        }
    }
}

abstract class GeometrikSekil {

    private int birincikenar;
    private int hesaplananAlan;

    abstract public void cevreHesapla();

    abstract public void alanHesapla();

    public int getHesaplananAlan() {
        return hesaplananAlan;
    }

    public void setHesaplananAlan(int hesaplananAlan) {
        this.hesaplananAlan = hesaplananAlan;
    }

    public int getBirincikenar() {
        return birincikenar;
    }

    public void setBirincikenar(int birincikenar) {
        this.birincikenar = birincikenar;
    }
}


class Kare extends GeometrikSekil {

    public Kare(int kenar) {
        this.setBirincikenar(kenar);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("karenin cevresi=" + getBirincikenar() * 4);

    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirincikenar() * getBirincikenar());
        System.out.println("Karenin alanı=" + getHesaplananAlan());

    }

    public void adiniSoyle() {
        System.out.println("ben bir kare sınıfı nesnesiyim");
    }
}


class Dikdortgen extends GeometrikSekil {

    private int ikincikenar;

    public Dikdortgen(int birincikenar, int ikincikenar) {
        setBirincikenar(birincikenar);
        this.ikincikenar = ikincikenar;
    }

    public int getIkincikenar() {
        return ikincikenar;
    }

    public void setIkincikenar(int ikincikenar) {
        this.ikincikenar = ikincikenar;
    }

    @Override
    public void cevreHesapla() {
        System.out.println("dikdortgenin cevresi = " + 2 * (getBirincikenar() + ikincikenar));
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirincikenar() * ikincikenar);
        System.out.println("dikdortgenin alanı=" + getHesaplananAlan());

    }

    public void adiniSoyle() {
        System.out.println("ben bir dikdörtgen nesnesiyim");
    }
}


class Daire extends GeometrikSekil {

    public Daire(int yaricap) {
        setBirincikenar(yaricap);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("dairenin cevresi=" + 2 * Math.PI * getBirincikenar());
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan((int) (Math.PI * Math.pow(getBirincikenar(), 2)));
        System.out.println("dairenin alanı=" + getHesaplananAlan());

    }
}










