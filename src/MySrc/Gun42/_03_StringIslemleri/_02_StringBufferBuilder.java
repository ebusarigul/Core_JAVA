package MySrc.Gun42._03_StringIslemleri;

import java.util.Arrays;

public class _02_StringBufferBuilder {
    public static void main(String[] args) {

        //cok fazla ekleme çıkarma yapılıcaksa performansı düşük

        String cumle="";

        cumle=cumle+" bugun ";
        cumle=cumle+" hava ";
        cumle=cumle+"guzel";
        System.out.println("cumle = " + cumle);
        cumle = cumle.concat(" oldu"); // atama gerekir...
        System.out.println("cumle = " + cumle);

        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır. Fakat paralel çalışan
        // uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.

        StringBuilder s=new StringBuilder();
        s.append("Bugün"); // tekrar kendine atama gerektirmez.
        s.append(" hava");
        s.append(" güzel");
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(4); // eklenen herseyi Stringe cevirip ekler.
        System.out.println("s = " + s);

        //s.reverse(); // stringi tersine cevririr.
        //System.out.println("s = " + s);

        s.delete(0,5); // indexe göre 0 dahil 5 hariç siler.
        System.out.println("s = " + s);

        s.deleteCharAt(3); // sadece belirtilen karakteri siler.
        System.out.println("s = " + s);

        s.insert(5,"kelime"); // 5 nolu indexe kelime eklendi
        System.out.println("s = " + s);

        s.insert(4,5.46); // 4 nolu indexe rakamda double da ekleyebiliriz.
        System.out.println("s = " + s);

        int [] dizi={1,2,43,56};
        s.insert(6, Arrays.toString(dizi));
        System.out.println("s = " + s);

        s=new StringBuilder("Bugun hava sıcak");
        System.out.println("s = " + s); // sıfırlandı ve belirtilen değer atandı

        s.replace(3,8,"bu"); // verilen aralıgı verilenle değiştir
        System.out.println("s = " + s);



    }
}
