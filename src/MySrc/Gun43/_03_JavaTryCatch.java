package MySrc.Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {


        try { //dene, hatanın basladıgı yerin üstüne konur
            System.out.println("program basladı");
            LocalDate tarih = LocalDate.of(2018, Month.JUNE, 40);
            System.out.println("islem tamam");
        } // hata oldugu zaman programı kırma

        catch (Exception hata) // hata isimli değişkende olusan hataların bilgisi atanıyor
        {
            System.out.println("şu hata olustu = " + hata.getMessage());
        }

        System.out.println("program çalışmaya devam etti");
        System.out.println("program bitti");

        try {
            //java calısmaya devam


        } // anlamadıgın yer mi oldu kırılmadan devam
        catch (Exception hata){
            //hatanın sebebini anla
            //gereken videoları tekrar izle
            //arkadaslarına sonra mentore sonra hocaya mutlaka sor
            //ögren ve kırılmadan devam et

        }

        // sonunda seni güzel bir meslek bekliyor.

    }
}
