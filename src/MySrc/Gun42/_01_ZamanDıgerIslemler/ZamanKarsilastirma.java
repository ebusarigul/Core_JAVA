package MySrc.Gun42._01_ZamanDıgerIslemler;

import java.time.LocalDate;

public class ZamanKarsilastirma {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        //bugun dünden sonra mı ? :D
        boolean sonraMi=bugun.isAfter(dun);
        System.out.println("sonraMi = " + sonraMi);
        //bugün dünden önce mi
        boolean onceMi=bugun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);
        //bugün düne eşit mi ? :D
        boolean esitMi=bugun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);
        //bugün artık yıl mı :D
        boolean artikYilMi=bugun.isLeapYear();
        System.out.println("artikYilMi = " + artikYilMi);







    }
}
