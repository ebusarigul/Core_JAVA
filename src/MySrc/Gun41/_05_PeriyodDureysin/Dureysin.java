package MySrc.Gun41._05_PeriyodDureysin;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dureysin {
    //Localtime ve LocalDatetime lar için kullanılır
    //bunların arasındaki farkları gösterir
    public static void main(String[] args) {
        //LocalTime
        LocalTime geceYarisi=LocalTime.of(0,0);
        LocalTime ogleVakti=LocalTime.of(13,3,2);


        Duration fark=Duration.between(geceYarisi,ogleVakti);
        System.out.println("fark = " + fark);
        System.out.println("fark.toHours() = " + fark.toHours()); //farkın toplam saat hali
        System.out.println("fark.toMinutes() = " + fark.toMinutes()); // farkın toplam dakida hali
        System.out.println("fark.toMillis() = " + fark.toSeconds()); // farkın toplam saniye farkı

        System.out.println("fark.toDaysPart() = " + fark.toDaysPart());
        System.out.println("fark.toHoursPart() = " + fark.toHoursPart());
        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart());
        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart());

        

        //LocalDateTime  **** 2 zaman farkı ****
        LocalDateTime from=LocalDateTime.of(2020,10,4,20,55);
        LocalDateTime to=LocalDateTime.of(2020,11,15,11,21,56);

        Duration farkzaman=Duration.between(from,to);
        System.out.println("farkzaman = " + farkzaman);
        System.out.println("farkzaman.toDays() = " + farkzaman.toDays()); //farkın toplam günü
        System.out.println("farkzaman.toHours() = " + farkzaman.toHours()); //farkın toplam saati
        System.out.println("farkzaman.toMinutes() = " + farkzaman.toMinutes()); // farkın toplam dakikası
        System.out.println("farkzaman.getSeconds() = " + farkzaman.getSeconds()); //farkın toplam saniye hali






    }
}
