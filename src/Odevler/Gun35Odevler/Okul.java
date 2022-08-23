package Odevler.Gun35Odevler;

import java.util.ArrayList;
import java.util.Arrays;

public class Okul {
    private String isim;
    private int kapasite;
    private Ogrenci ogrenci;
    private Calisan calisan;

    static ArrayList<Ogrenci> ogrler=new ArrayList<>();
    static ArrayList<Calisan> calisanlar=new ArrayList<>();

    public Okul() {
        this.isim="TechnoStudy";
        this.kapasite=250;
    }
    public Okul(String isim, Ogrenci ogrenci, Calisan calisan) {
        this.isim = isim;
        this.ogrenci = ogrenci;
        this.calisan = calisan;
    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public Calisan getCalisan() {
        return calisan;
    }

    public void setCalisan(Calisan calisan) {
        this.calisan = calisan;
    }

    public static void ogrList(){
        System.out.println("---OGRENCİLER---");
        for (Ogrenci ogr : ogrler){
            System.out.println(ogr);
        }
        System.out.println();
    }

    public static void calisanlarList(){
        System.out.println("---CALİSANLAR---");
        for (Calisan c : calisanlar){
            System.out.println(c);
        }
    }
    @Override
    public String toString() {
        return "Okul adı="+isim+" Kapasite="+kapasite;
    }
}
