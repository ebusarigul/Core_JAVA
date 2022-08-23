package UdemyMyWorking._06_TvSimilasyon.Bolum1;

import java.util.Scanner;

public class Bolum1 {
    static Scanner oku = new Scanner(System.in);
    static Televizyon tv;
    public static void main(String[] args) {


        menuGoster();
        boolean cıkıs = false;
        while (!cıkıs) {
            System.out.println("seciminiz : (menüyü görmek için 8i tuslayın)");
            int secim = oku.nextInt();

            switch (secim) {
                case 1:
                    tvKurveKanallariOlustur();
                case 2:
                   tvAc();break;
                case 3:
                    sesArttir();break;
                case 4:
                    sesAzalt();break;
                case 5:
                    kanalDegistir();break;
                case 6:
                    kanalBilgisiniGoster();
                case 7:
                    tvKapat();break;

                case 8:
                    menuGoster();
                    break;
                case 0:
                    System.out.println("sistemden çıkıyor");
                    cıkıs = true;
                    break;
                default:
                    System.out.println("0 ile 8 arasında bir değer giriniz");
                    break;

            }


        }


    }

    private static void kanalBilgisiniGoster() {
        if (tv != null){
            tv.aktifKanaliGoster();
        }else {
            System.out.println("önce tv yi kurun ve kanalları olusturun");
        }
    }

    private static void kanalDegistir() {
        if (tv != null){
            System.out.print("hangi kanala geçmek istiyorsunuz");
            int acilmasiIstenenKanal= oku.nextInt();
            tv.kanalDegistir(acilmasiIstenenKanal);
        }else {
            System.out.println("önce tv yi kurun ve kanalları olusturun");
        }
    }

    private static void sesArttir() {
        if (tv != null){
            tv.sesArttir();

        }else {
            System.out.println("önce tv yi kurun ve kanalları olusturun");
        }
    }
    private static void sesAzalt() {
        if (tv != null){
            tv.sesAzalt();

        }else {
            System.out.println("önce tv yi kurun ve kanalları olusturun");
        }
    }

    private static void tvKapat() {
        if (tv != null){
            tv.tvKapat();
        }else {
            System.out.println("önce tv yi kurun ve kanalları olusturun");
        }
    }

    private static void tvAc() {
        if (tv != null){
            tv.tvAc();
        }else {
            System.out.println("önce tv yi kurun ve kanalları olusturun");
        }
    }

    private static void tvKurveKanallariOlustur() {
        if (tv==null){
            oku.nextLine();
            System.out.println("Televizyonun markasını giriniz = ");
            String marka=oku.nextLine();
            System.out.println("Televizyonun boyutunu giriniz = ");
            String boyut= oku.nextLine();
            tv=new Televizyon(marka,boyut);
            System.out.println(tv);
        }else {
            System.out.println(tv);
        }
    }

    private static void menuGoster() {
        System.out.println("*********MENU**********");
        System.out.println("0 -- çıkıs\n" +
                "1 -- Televizyonu Kur\n" +
                "2 -- Televizyonu aç\n" +
                "3 -- Sesini arttır\n" +
                "4 -- Sesi azalt\n" +
                "5 -- Kanal değiştir\n" +
                "6 -- Kanal Bilgisi Göster\n" +
                "7 -- Televizyonu Kapat\n" +
                "8 -- Menüyü Göster\n");
    }
}
