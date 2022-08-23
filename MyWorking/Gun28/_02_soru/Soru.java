package Gun28._02_soru;

public class Soru {

    public static void main(String[] args) {

        // Math sınıfndaki metodlarıdan 5 tanesini ve bir de diziElemanlarTopla fonksiyonlarını
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        System.out.println("iki sayıdan buyugu = " + islem.getmax(4, 5));
        System.out.println("iki sayıdan kucuk bul = " + islem.getmin(8, 3));
        int[] dizi = {20, 45, 65, 74, 21};
        System.out.println("dizinin toplamı = " + islem.getarraytopla(dizi));

        System.out.println("üst sonuc = " + islem.getpow(2, 3));
        System.out.println("belirlediğim sayıya kadar random = " + islem.getrandom(15));


    }
}
