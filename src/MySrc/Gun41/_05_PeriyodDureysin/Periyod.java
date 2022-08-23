package MySrc.Gun41._05_PeriyodDureysin;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Periyod {
    public static void main(String[] args) {

        LocalDate dogumTarihi=LocalDate.of(1998,1,1);
        LocalDate bugun=LocalDate.now();

        Period fark=Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println("fark = " + fark.getYears() + "yıl = " + fark.getMonths()+" ay"  );

        //*********************************

        Period period3gun=Period.ofDays(3);
        Period period3ay=Period.ofMonths(3);

        LocalDate ucGunSonra=bugun.plus(period3gun);
        LocalDate ucAySonra=bugun.plus(period3ay);

        System.out.println("ucGunSonra = " + ucGunSonra);
        System.out.println("ucAySonra = " + ucAySonra);

        //örnek kursun süresi
        LocalDate kursunBaslangici=LocalDate.of(2022,4,18);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis=kursunBaslangici.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis = " + kursBitis.getDayOfWeek());

        Period kacGunKaldi=Period.between(bugun,kursBitis);
        System.out.println("kacGunKaldi = " + kacGunKaldi);
        System.out.println("kacGunKaldi= " + kacGunKaldi.getMonths()+"ay"+kacGunKaldi.getDays()+"gün");











    }
}
