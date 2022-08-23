package MySrc.Gun41._01_Date;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());

        //isimleri locale göre gösteriyor
        System.out.println("tarih.format(DateTimeFormatter.ISO_DATE) = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        //localdaki saati aldın Almanya ya göre gösterir
        System.out.println("FULL Locale.GERMANY = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        Locale[] kullanilabilirlocaller = Locale.getAvailableLocales();
        for (Locale l : kullanilabilirlocaller) {
            if (l.getDisplayCountry().toLowerCase().contains("new"))
                System.out.println(l.getDisplayCountry() + " " + l + " " + l.getDisplayLanguage());
        }

        Locale localNewZeland = new Locale("en", "NZ");
        System.out.println("FULL LocaleNewZealand = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localNewZeland)));

        //istedigin formatta gösterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelformat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy= " + tarih.format(ozelformat1));

        DateTimeFormatter ozelformat2 = DateTimeFormatter.ofPattern("dd.MM yy");
        System.out.println("tarih dd.MM yy= " + tarih.format(ozelformat2));

        DateTimeFormatter ozelformat3 = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy= " + tarih.format(ozelformat3));

        //kendimiz bir tarihi nasıl set edebiliriz , olusturabiliriz

        LocalDate tarih1 = LocalDate.of(2020, 6, 1);
        LocalDate tarih2 = LocalDate.of(2021, Month.DECEMBER, 6);

        System.out.println("tarih1 = " + tarih1.format(ozelformat3));
        System.out.println("tarih2.format(ozelformat3) = " + tarih2.format(ozelformat3));

    }
}
