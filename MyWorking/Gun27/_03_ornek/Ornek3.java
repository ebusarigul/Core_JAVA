package Gun27._03_ornek;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        //1.Adım  :ayrı dosyada olmak üzere Musteri isimli (fields: name) isimli bir class tanımlayınız.
        //2.Adım  :ayrı bir dosyada ElektrikHesabi isimli (fields : toplamTuketim, oran(double), OdenecekTutar)
        //3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        //4.Adım  :1 tane müşteri oluşturunuz,
        //5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
        //         tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        //6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız yazdırınız.

        //ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
        //        ondan sonra toplam alarak çıkartınız

        Musteri client=new Musteri();
        client.name="Ebubekir Sarıgül";
        ElektrikHesabi hesap=new ElektrikHesabi();
        client.elektrikHesabi=hesap;

        client.elektrikHesabi.tuketimekle(240);
        client.elektrikHesabi.tuketimekle(180);
        client.elektrikHesabi.tuketimekle(410);

        hesap.odenecekTutar = client.elektrikHesabi.odenecekbul(hesap.toplamTuketim, hesap.oran);

        System.out.println(client.name+ "ün ödeyeceği fatura tutarı= "+ hesap.odenecekTutar + " tl" );






























    }
}
