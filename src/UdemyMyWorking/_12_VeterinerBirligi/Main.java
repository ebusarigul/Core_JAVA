package UdemyMyWorking._12_VeterinerBirligi;

public class Main {
    public static void main(String[] args) {


        ilkNesneleriOlusur();












    }

    private static void ilkNesneleriOlusur() {
        Kedi kedi = new Kedi("01-01-2016",true,"Van Kedisi");
        Kedi kedi2 = new Kedi("01-04-2016",false,"Siyam Kedisi");
        Kedi kedi3 = new Kedi("01-10-2017",true,"İran Kedisi");

        Kopek kopek=new Kopek("02-06-2018",true,1,"Golden");
        Kopek kopek2=new Kopek("05-05-201",true,2,"Pomernian");
        Kopek kopek3=new Kopek("17-06-2015",true,4,"Malteise");

        Musteri m1=new Musteri("Ebu", "123","Bursa");
        m1.musteriyeHayvanEkle(kedi);
        m1.musteriyeHayvanEkle(kopek);

        Musteri m2=new Musteri("hasan", "234","İzmir");
        m2.musteriyeHayvanEkle(kedi2);
        m2.musteriyeHayvanEkle(kopek2);

        Musteri m3=new Musteri("mehmet", "456","Ankara");
        m3.musteriyeHayvanEkle(kedi3);
        m3.musteriyeHayvanEkle(kopek3);


        Veteriner v1=new Veteriner("Ayse","4567","ankara uni",1);
        v1.musteriEkle(m1);v1.musteriEkle(m2);
        Veteriner v2=new Veteriner("Fatma","325","ege uni",4);
        v2.musteriEkle(m3);v2.musteriEkle(m1);
        Veteriner v3=new Veteriner("Silan","6457","uludag uni",5);
        v3.musteriEkle(m3);

        v1.musterileriListele();
        SehirVeterinerlikleri ankara=new SehirVeterinerlikleri("ankara");
        ankara.sehireVeterinerEkle(v1);ankara.sehireVeterinerEkle(v2);

        SehirVeterinerlikleri bursa=new SehirVeterinerlikleri("bursa");
        bursa.sehireVeterinerEkle(v3);

        ankara.sehirdekitoplamvetsayisiniBul();
        bursa.sehirdekitoplamvetsayisiniBul();

        System.out.println("Yönetim Paneli Baslıyor");

        YonetimPaneli<Hayvan> hayvanYonetimPaneli=new YonetimPaneli<>();
        hayvanYonetimPaneli.bilgileriGoster(kedi);
        hayvanYonetimPaneli.bilgileriGoster(kopek);

        YonetimPaneli<Musteri> musteriYonetimPaneli=new YonetimPaneli<>();
        musteriYonetimPaneli.bilgileriGoster(m1);

        musteriYonetimPaneli.sahipolduguHayvanlariGoster(m1);


    }
}
