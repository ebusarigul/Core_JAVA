package MySrc.Gun41._02_Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) throws InterruptedException {

        //tarih içermez sadece saat,dak,san, nano saniye içerir
        LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        // kendimize özel format olusturma

        DateTimeFormatter ozelformat1=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println("saat of 1= " + saat.format(ozelformat1));

        DateTimeFormatter ozelformat2=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("saat of 2= " + saat.format(ozelformat2));

        DateTimeFormatter ozelformat3=DateTimeFormatter.ofPattern("kk:mm a");
        System.out.println("saat of 3= " + saat.format(ozelformat3));

        while (true){
            saat=LocalTime.now();
            System.out.print("\r"+"saat = " + saat.format(ozelformat2));

            Thread.sleep(1000); // 1 saniye bekleyecek
        }









    }
}
