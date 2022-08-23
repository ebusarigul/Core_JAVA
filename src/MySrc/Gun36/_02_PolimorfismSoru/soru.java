package MySrc.Gun36._02_PolimorfismSoru;

public class soru {
    public static void main(String[] args) {
        //1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
        //2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
        //3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
        //  olacak kimlik belgesi formu oluşturan tek bir metod yazınız.
        //
        //  not: 3.istekdeki gibi her iki sınıfnda çalşacağı bir metodun olabilmesi için,
        //    her iki sınıfın da bir üst sınıftan türetilmesi zorunludur.
        //    aksi halde ayrı ayı 2 metod yazılmak zorunda kalınır.

        Kisi ogr1 = new Ogrenci("Ebubekir", "Sarıgül", "SDET", "BatchTR");
        Kisi cls1 = new Calisan("Furkan", "Simsek", "Mentor,SDET", "MENTOR");

        Kisi.kimlikbelgesi(ogr1);
        Kisi.kimlikbelgesi(cls1);
    }
}
