package UdemyMyWorking._12_VeterinerBirligi;

import java.util.ArrayList;

public class SehirVeterinerlikleri{

    private String sehir;
    private int toplamvetsayisi;
    private ArrayList<Veteriner> sehirdekiveterinerler;

    public SehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        sehirdekiveterinerler=new ArrayList<>();
        toplamvetsayisi=0;
    }
    public void sehireVeterinerEkle(Veteriner veteriner){
        sehirdekiveterinerler.add(veteriner);
        toplamvetsayisi++;
    }
    public void sehirdekitoplamvetsayisiniBul(){
        System.out.println("toplam veteriner sayisi = " + sehirdekiveterinerler.size());
    }
}
