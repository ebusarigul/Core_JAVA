package Udemy;

public class StaticKavrami {

    public static void main(String[] args) {

        Memur m1 = new Memur();
        m1.setIsim("ebu");
        m1.setMaas(8000);

        Memur m2 = new Memur();
        m2.setIsim("hasan");
        m2.setMaas(4500);

        Memur m3 = new Memur();
        m3.setIsim("ayse");
        m3.setMaas(2500);

        m3.bilgileriGoster();
        m1.kanunuSoyle();
        m2.kanunuSoyle();
        m3.kanunuSoyle();
        Memur.kanunuSoyle();


        System.out.println("nesne sayısı m1=" + m1.olusturulanMemurNesnesi);
        System.out.println("nesne sayısı m2=" + m2.olusturulanMemurNesnesi);
        System.out.println("nesne sayısı m3=" + m3.olusturulanMemurNesnesi);
        System.out.println("nesne sayısı sınıf=" + Memur.olusturulanMemurNesnesi);


    }

}

class Memur {
    private String isim;
    private int maas;
    public static int olusturulanMemurNesnesi;

    public Memur() {
        olusturulanMemurNesnesi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if (maas < 0) {
            maas = 0;
        } else {
            this.maas = maas;
        }
    }

    public static void kanunuSoyle() {
        System.out.println("657 nolu kanun gecerli");
    }

    public void bilgileriGoster() {
        System.out.println("olusturulan memur nesnesi=" + olusturulanMemurNesnesi);

    }
}
