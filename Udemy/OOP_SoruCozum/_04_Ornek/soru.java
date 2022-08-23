package Udemy._04_Ornek;

public class soru {
    public static void main(String[] args) {
 /*
 //  1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
 //  2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim, oran(double),
              OdenecekTutar) class tanımlayınız

//  4.Adım  :1 tane müşteri oluşturunuz,
 //  5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
 //           tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
 6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.
 ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
 //          ondan sonra toplam alarak çıkartınız  */


        ElektrikHesabi hesap=new ElektrikHesabi();

        Musteri client= new Musteri("Ebubekir Sarıgül",hesap);

        client.hesap.setToplamTuketim(200);
        client.hesap.setToplamTuketim(200);
        client.hesap.setToplamTuketim(300);

        client.hesap.getToplamTuketim();

        client.hesap.getOdenecektutar();

        client.hesap.bilgileriYazdir();






















    }
}
