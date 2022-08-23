package Gun30.soru;

public class soru1 {
    public static void main(String[] args) {

        // Hesap (yatan, cekilen, bakiye(direk erişim olmamalı))
        // Musteri (hesapID, ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,
        // sonra 50 TL çekiniz. Müşteirini kalan bakiyesini yazdırınız.
        // bakiyeye direk para atanamadıgını kontrol ediniz.


        Hesap newhesap=new Hesap();
        Musteri mus1=new Musteri(456,"Ebubekir","Sarıgül",newhesap);

        newhesap.setYatan(100);
        newhesap.getYatan();
        newhesap.setYatan(200);
        newhesap.getYatan();
        newhesap.setCekilen(50);
        newhesap.getCekilen();

        newhesap.getKalanbakiye();














    }
}
