package Udemy._05_Kalıtım_Ornek1;

public class kalitimOrnek {
    public static void main(String[] args) {

        /*Dikdortgen dk1 = new Dikdortgen(10, 20);
        dk1.ozellikYazdir();
        System.out.println("dk1 = " + dk1);

        GeometrikSekil gs1=new GeometrikSekil(5,10);
        System.out.println(gs1);
*/
        Kare k1=new Kare(10);
        k1.alanHesapla();
        k1.cevreHesapla();
    }
}

class GeometrikSekil {
    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
        System.out.println("geometrik sekil olusturuluyor");
    }

    public GeometrikSekil() {
        System.out.println("geometrik sekil olusturuluyor");
    }

    public GeometrikSekil(int en) {
        this.en = en;
        System.out.println("geometrik sekil olusturuluyor");
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public void alanHesapla() {
        System.out.println("Alan : " + en * boy);
    }

    public void cevreHesapla() {
        System.out.println("Cevre : " + (en + boy) * 2);
    }

    @Override
    public String toString() {
       return "en : " +en + " boy : " + boy;
    }
}
class Dikdortgen extends GeometrikSekil {

    public Dikdortgen(int en, int boy) {
        setEn(en);
        setBoy(boy);
        System.out.println("dikdortgen olusturuluyor");
    }
    public Dikdortgen(int en){
        setEn(en);
        System.out.println("dikdortgen olusturuluyor");


    }

    public void ozellikYazdir() {
        System.out.println("Geometrik seklin eni : " + getEn() + " boyu : " + getBoy());
        alanHesapla();
        cevreHesapla();
    }

    @Override
    public String toString() {
        return "dikdortgenin eni : " + getEn() + " boyu : " + getBoy();
    }
}

class Kare extends Dikdortgen{

    public Kare(int en) {
        super(en);
        setBoy(en);
        System.out.println("kare olusturuluyor");
    }
}

