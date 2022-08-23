package UdemyMyWorking._12_VeterinerBirligi;

import java.util.ArrayList;

public class Musteri extends Kisi{

    private String adres;
    private ArrayList<Hayvan> musteriHayvanlari;



    public Musteri(String isim, String tcKimlik,String adres) {
        super(isim, tcKimlik);
        this.adres=adres;
        musteriHayvanlari=new ArrayList<>();
    }
    public void musteriyeHayvanEkle(Hayvan hayvan){
        musteriHayvanlari.add(hayvan);
        System.out.println(hayvan+" "+ getIsim()+" musterisine eklendi");
    }

    public void musteriHayvanlariniListele(){
        for (Hayvan h: musteriHayvanlari){
            System.out.println(h);
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString()+ "ben bir müsteriyim");
    }

    @Override
    public String toString() {
        return super.toString() + "Musteri{" +
                "adres='" + adres + '\'' +
                '}';
    }
}
