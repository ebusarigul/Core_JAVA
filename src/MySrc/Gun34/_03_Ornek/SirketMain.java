package MySrc.Gun34._03_Ornek;

public class SirketMain {
    public static void main(String[] args) {

        //Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
        //consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.
        //GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
        //GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
        //SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
        //maaşları hesaplatıp, bordroyu yazdırınız.

        Calisan calisan=new Calisan("Ebubekir",5000,2);
        System.out.println("calisan = " + calisan);
        calisan.maashesapla();

        GenelMudur mudur=new GenelMudur("İsmet",15000,2,30000);
        System.out.println("mudur = " + mudur);
        mudur.maashesapla();


    }
}

class Calisan {
    private String isim;
    private int maas;
    private int maasKatSayisi=2;

    public Calisan(String isim, int maas, int maasKatSayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatSayisi = maasKatSayisi;
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
        this.maas = maas;
    }

    public int getMaasKatSayisi() {
        return maasKatSayisi;
    }

    public void setMaasKatSayisi(int maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }

    public void maashesapla() {
        this.maas=maas*maasKatSayisi;
        System.out.println("maas = " + maas);
    }

    @Override
    public String toString() {
        return "isim="+getIsim()+" maas="+getMaas()+" maas katsayısı="+getMaasKatSayisi();
    }
}

class GenelMudur extends Calisan {
    private int tazminat;

    public int getTazminat() {
        return tazminat;
    }

    public void setTazminat(int tazminat) {
        this.tazminat = tazminat;
    }

    public GenelMudur(String isim, int maas, int maasKatSayisi, int tazminat) {
        super(isim, maas, maasKatSayisi);
        this.tazminat = tazminat;

    }
    public void maashesapla(){
        setMaas(getMaas()*getMaasKatSayisi()+tazminat);
        System.out.println("maas = " + getMaas());

    }

    @Override
    public String toString() {
        return "isim="+getIsim()+" maas="+getMaas()+" maas katsayısı="+getMaasKatSayisi()+ " tazminat="+tazminat ;
    }
}