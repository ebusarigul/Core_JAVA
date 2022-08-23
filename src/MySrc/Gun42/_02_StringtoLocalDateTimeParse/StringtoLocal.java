package MySrc.Gun42._02_StringtoLocalDateTimeParse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringtoLocal {
    public static void main(String[] args) {

        //kullanıcıdan alınan ve string durumunda olan bir time veya tarih
        // bilgisinin time veya tarih değişkenine çevrilmesi

        String strDate="25 01 2020"; // 01/25/2020 de olabilir

        //String degeri tarihe cevirmek için format belirledik
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd MM yyyy");

        //Stringin formatı bu formata uygun olmalı. parse ile çevirdik
        LocalDate tarih=LocalDate.parse(strDate,format);

        System.out.println("tarih = " + tarih.format(format));







    }
}
