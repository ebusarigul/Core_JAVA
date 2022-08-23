package Udemy;

public class Ogrenci {

    private int ogrenciNo;
    private String isim;
    private byte sinif;
    private boolean aktif;


    public void setOgrenciNo(int yeniogrenciNo){
        this.ogrenciNo=yeniogrenciNo;
    }
    public int getOgrenciNo(){
        return this.ogrenciNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public byte getSinif() {
        return sinif;
    }

    public void setSinif(byte sinif) {
        this.sinif = sinif;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public Ogrenci(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public Ogrenci(int ogrenciNo, String isim) {
        this(ogrenciNo);
        this.isim = isim;
    }

    public Ogrenci(int ogrenciNo, String isim, byte sinif) {
        this(ogrenciNo, isim);
        this.sinif = sinif;
    }

    public Ogrenci(int ogrenciNo, String isim, byte sinif, boolean aktif) {
        this(ogrenciNo, isim, sinif);
        this.aktif = aktif;
    }

    public Ogrenci() {

    }

    public void ogrenciBilgileriniyazdir() {
        if (aktif) {
            System.out.println("Adım=" + isim + " numaram=" + ogrenciNo + " sınıfım=" + sinif + " aktiflik=" + aktif);
        } else {
            System.out.println("bu ögrenci aktif değil");
        }
    }

}
