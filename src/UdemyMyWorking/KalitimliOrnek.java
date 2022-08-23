package UdemyMyWorking;

public class KalitimliOrnek {
    public static void main(String[] args) {

        Personel mudur=new Personel("ahmet",123456,40,"mudur");
        System.out.println(mudur);
        System.out.println();

        Ogrenci og1=new Ogrenci("ebubekir",1271316,24,17454);
        System.out.println(og1);
        System.out.println();

        MezunOgrenci mz1=new MezunOgrenci("kamil",7465513,35,456,"Bosch");
        System.out.println(mz1);

    }
}
class Kisi{
    private String isim;
    private long tcKimlik;
    private int yas;

    public Kisi() {
        isim="henüz atanmadı";
        tcKimlik=0;
        yas=18;
    }

    public Kisi(String isim, long tcKimlik, int yas) {
        this.isim = isim;
        this.tcKimlik = tcKimlik;
        setYas(yas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 18 ){
            this.yas=yas;
        }else {
            this.yas=18;
        }

    }

    @Override
    public String toString() {
        return "ad :"+isim+ " tc ="+tcKimlik+ " yas="+yas;
    }
}

class Personel extends Kisi{
    private String pozisyon;

    public Personel(String isim, long tcKimlik, int yas, String pozisyon) {
        super(isim, tcKimlik, yas);
        this.pozisyon = pozisyon;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "Personel adı ="+getIsim()+ " tc ="+getTcKimlik()+ " yas="+getYas()+ " pozisyon="+pozisyon;
    }
}
class Ogrenci extends Kisi{
    private int ogrenciNo;

    public Ogrenci(String isim, long tcKimlik, int yas, int ogrenciNo) {
        super(isim, tcKimlik, yas);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "ogr ismi ="+getIsim()+ " tc no="+getTcKimlik()+ " yası="+getYas()+ " ogrNo="+ogrenciNo;
    }
}

class MezunOgrenci extends Ogrenci{
    private String calistigiYer;

    public MezunOgrenci(String isim, long tcKimlik, int yas, int ogrenciNo,String calistigiYer) {
        super(isim, tcKimlik, yas, ogrenciNo);
        this.calistigiYer=calistigiYer;
    }

    public String getCalistigiYer() {
        return calistigiYer;
    }

    public void setCalistigiYer(String calistigiYer) {
        this.calistigiYer = calistigiYer;
    }

    @Override
    public String toString() {
        return "mzn ogr ismi ="+getIsim()+ " tc no="+getTcKimlik()+ " yası="+getYas()
                + " ogrNo="+getOgrenciNo() + " calıstıgı yer="+calistigiYer;
    }
}

