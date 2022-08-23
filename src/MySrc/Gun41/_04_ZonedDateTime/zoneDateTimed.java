package MySrc.Gun41._04_ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class zoneDateTimed {
    public static void main(String[] args) {
        //baska zaman bölgelerinnin zaman dilimlerini alma

        ZonedDateTime zdtLokal=ZonedDateTime.now(); // su andaki bölgenin  zaman verdi yani lokal
        System.out.println("zdt = " + zdtLokal);

       // ZonedDateTime zdtLondon=ZonedDateTime.now(ZoneID);

        Set<String> zn = ZoneId.getAvailableZoneIds();
        for (String z : zn){
            if (z.toLowerCase().contains("los"))
            System.out.println("z = " + z);
        }

        //Europe/London
        //simdi bu8 stringden Zoneid olusturalım

        ZoneId zoneLA=ZoneId.of("America/Los_Angeles");
        ZonedDateTime zdtLA=ZonedDateTime.now(zoneLA);

        System.out.println("zdtLA = " + zdtLA);

        DateTimeFormatter ozelformat=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("zdtLA.format(ozelformat) = " + zdtLA.format(ozelformat));







    }
}
