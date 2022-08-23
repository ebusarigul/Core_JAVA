package UdemyMyWorking._12_VeterinerBirligi;

import java.util.ArrayList;

public class Veteriner extends Kisi{

    private String mezunolduguOkul;
    private int calismaSuresi;
    private ArrayList<Musteri> veterinerMusterileri;
    private int musteriSayisi;

    public Veteriner(String isim, String tcKimlik,String mezunolduguOkul,int calismaSuresi) {
        super(isim, tcKimlik);
        this.mezunolduguOkul=mezunolduguOkul;
        this.calismaSuresi=calismaSuresi;
        veterinerMusterileri=new ArrayList<>();
        musteriSayisi=0;
    }

    public void musteriEkle(Musteri musteri){
        veterinerMusterileri.add(musteri);
        musteriSayisi++;
    }
    public void musterileriListele(){
        for (Musteri m : veterinerMusterileri){
            m.kendiniTanit();
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(this.toString()+" ben bir veterinerim");
    }

    @Override
    public String toString() {
        return super.toString()+ "Veteriner{" +
                "mezunolduguOkul='" + mezunolduguOkul + '\'' +
                ", calismaSuresi=" + calismaSuresi +
                '}';
    }
}
