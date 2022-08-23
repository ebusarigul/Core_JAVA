package Gun41.PeriodAndDuration;

import java.time.LocalDate;
import java.time.Period;

public class _01_Period {
     // 2 tarih arasındaki farkı gosterir
     // LocaDate ler için kullanılır.
     public static void main(String[] args) {
         LocalDate dogumTarihi= LocalDate.of(1973,2,21);
         LocalDate buGun= LocalDate.now();

         Period fark= Period.between(dogumTarihi, buGun);
         System.out.println("fark = " + fark);

         System.out.println("fark.getYears() = " + fark.getYears());
         System.out.println("fark.getMonths() = " + fark.getMonths());
         System.out.println("fark.getDays() = " + fark.getDays());

         System.out.println("Fark="+ fark.getYears()+" yıl "+ fark.getMonths()+" ay");



     }



}
