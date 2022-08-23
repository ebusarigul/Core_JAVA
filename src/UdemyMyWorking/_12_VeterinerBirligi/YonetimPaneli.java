package UdemyMyWorking._12_VeterinerBirligi;

public class YonetimPaneli<T> {

    public void bilgileriGoster(T nesne){
        System.out.println(nesne);
    }

    public <T extends Musteri> void sahipolduguHayvanlariGoster(T musteri){
         musteri.musteriHayvanlariniListele();
    }
    public void veterinerMusterileriniListele(T veteriner){
        ((Veteriner)veteriner).musterileriListele();
    }



}
