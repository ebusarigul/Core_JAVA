package MySrc.Gun40._02_;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TechnoKitchen extends TechnoCafe {
    static DateTimeFormatter ozelformat2=DateTimeFormatter.ofPattern("hh:mm:ss");
    static LocalTime siparishazir=LocalTime.of(13,51);
    static LocalTime siparissaati=LocalTime.of(13,32);
    public static ArrayList<IFood> siparisler = new ArrayList<>();

    public static void yemekHazirlama(ArrayList<IFood> siparis) throws InterruptedException {
        for (IFood f : siparisler) {
            if (f instanceof AdanaKebap) {
                System.out.println("***" + "AdanaKebap" + "***");
                new AdanaKebap().marinade();ikisnbekle();
                new AdanaKebap().grill();ikisnbekle();
                new AdanaKebap().taste();ikisnbekle();
                System.out.println();
            } else if (f instanceof Lahmacun) {
                System.out.println("***" + "Lahmacun" + "***");
                new Lahmacun().dough();ikisnbekle();
                new Lahmacun().addMeat();ikisnbekle();
                new Lahmacun().bake();ikisnbekle();
                new Lahmacun().taste();ikisnbekle();
                System.out.println();
            } else if (f instanceof Borsh) {
                System.out.println("***" + "Borsh" + "***");
                new Borsh().boil();ikisnbekle();
                new Borsh().eatTomorrow();ikisnbekle();
                new Borsh().taste();ikisnbekle();
                System.out.println();
            } else if (f instanceof Palov) {
                System.out.println("***" + "Palov" + "***");
                new Palov().fry();ikisnbekle();
                new Palov().boil();ikisnbekle();
                new Palov().taste();ikisnbekle();
                System.out.println();
            }
        }
        System.out.print("siparisiniz hazır...");
        LocalTime hazir=LocalTime.now();
        System.out.println("saat="+hazir.format(ozelformat2));

    }

    private static void ikisnbekle() throws InterruptedException {
        Thread.sleep(2000);
    }


    public static void siparisleriAl(int secim) throws InterruptedException {
        if (secim == 1) {
            siparisler.add(new AdanaKebap());
        } else if (secim == 2) {
            siparisler.add(new Lahmacun());
        } else if (secim == 3) {
            siparisler.add(new Borsh());
        } else if (secim == 4) {
            siparisler.add(new Palov());
        } else if (secim == 0) {
            System.out.print("siparis alındı hazırlanıyor...");ikisnbekle();
            LocalTime sip=LocalTime.now();
            System.out.println("saat="+sip.format(ozelformat2));

        }

    }

    public static void ucretHesapla(ArrayList<IFood> siparisler) throws InterruptedException {
        int adanaKebap = 0;
        int lahmacun = 0;
        int borsh = 0;
        int palov = 0;
        int toplam = 0;

        for (IFood f : siparisler) {
            if (f instanceof AdanaKebap) {
                adanaKebap++;
                toplam += f.ucret();
            } else if (f instanceof Lahmacun) {
                lahmacun++;
                toplam += f.ucret();
            } else if (f instanceof Borsh) {
                borsh++;
                toplam += f.ucret();
            } else if (f instanceof Palov) {
                palov++;
                toplam += f.ucret();
            }
        }
        System.out.println("***Adisyon***");
        if (adanaKebap > 0) {
            System.out.println("AdanaKebap=" + adanaKebap + " porsiyon");
        }
        if (lahmacun > 0) {
            System.out.println("Lahmacun=" + lahmacun + " porsiyon");
        }
        if (borsh > 0) {
            System.out.println("Borsh=" + borsh + " porsiyon");
        }
        if (palov > 0) {
            System.out.println("Palov=" + palov + " porsiyon");
        }
        System.out.println();

        System.out.println("Toplam Ucret = " + toplam + " TL");
        Duration fark=Duration.between(siparissaati,siparishazir);
        System.out.println("Toplam siparis süresi = "+ fark.toMinutesPart()+" dakika");

    }

    public static void menuyaz() {
        System.out.println("1-Adana Kebap (45 TL)" + "\n" + "2-Lahmacun(20 TL)" + "\n" + "3-Borsh(25 TL)" + "\n" + "4-Palov(25 TL)" + "\n" +
                "0-Tamam..." + "\n" + "Seciminizi Giriniz = ");
    }

}
