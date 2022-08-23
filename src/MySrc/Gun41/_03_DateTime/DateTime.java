package MySrc.Gun41._03_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTime {
    public static void main(String[] args) {

        // LocalDateTime hem tarih hemde saat bilgisini tutar

        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());

        System.out.println("MEDIUM = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        DateTimeFormatter ozelformat=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("dt.ozel format = " + dt.format(ozelformat));










    }
}
