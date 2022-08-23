package UdemyMyWorking._11_GenericsMetotKavrami;

public class GenericMetotKavrami {
    public static void main(String[] args) {


        String[] isimler = {"emre", "ayse", "ali"};

        Integer[] sayilar = {1, 5, 7, 9, 10};

        Character[] karakterler = {'a', 'b', 'k'};
        /*
        StringDiziYazdir(isimler);
        IntDiziYazdir(sayilar);
        CharDiziYazdir(karakterler);


        diziYazdir(isimler);
        diziYazdir(sayilar);
        diziYazdir(karakterler);


         */

        genericMetinYazdir(isimler);
        genericNumaraYazdir(sayilar);
        //genericMetinYazdir(karakterler);

    }

    public static <Genel extends Number> void genericNumaraYazdir(Genel [] dizi){
        for (Genel g : dizi){
            System.out.println(g.intValue());
        }

    }
    public static <Genel extends CharSequence> void genericMetinYazdir(Genel [] dizi){
        for (Genel g : dizi){
            System.out.println(g.length());
        }

    }

    public static void diziYazdir(Object [] dizi){
        for (Object s : dizi){
            System.out.println(((Integer)s).intValue());
        }
    }

    public static void StringDiziYazdir(String [] dizi){
        for (String s : dizi){
            System.out.println(s);
        }
    }
    public static void IntDiziYazdir(Integer [] dizi){
        for (Integer s : dizi){
            System.out.println(s);
        }
    }
    public static void CharDiziYazdir(Character [] dizi){
        for (Character s : dizi){
            System.out.println(s);
        }
    }






}
