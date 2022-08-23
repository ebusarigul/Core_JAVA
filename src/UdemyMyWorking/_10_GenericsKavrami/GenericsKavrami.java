package UdemyMyWorking._10_GenericsKavrami;

import java.util.ArrayList;

public class GenericsKavrami {
    public static void main(String[] args) {

        String [] isimler= {"emre","ayse","ali"};

        Integer [] sayilar={1,5,7,9,10};

        Character [] karakterler={'a','b','k'};

        /*StringDiziYazdir.yazdir(isimler);
        IntDiziYazdir.yazdir(sayilar);
        CharDiziYazdir.yazdir(karakterler);
*/


        //int için Integer, char---Character;
        GenericDiziYazdir<String> stringGenericDiziYazdir=new GenericDiziYazdir<String>();
        stringGenericDiziYazdir.yazdir(isimler);

        GenericDiziYazdir<Integer> integerGenericDiziYazdir=new GenericDiziYazdir<>();
        integerGenericDiziYazdir.yazdir(sayilar);

        GenericDiziYazdir<Character> characterGenericDiziYazdir=new GenericDiziYazdir<>();
        characterGenericDiziYazdir.yazdir(karakterler);

        ArrayList<String> listem=new ArrayList<>();
        listem.add("ankara");
        listem.add("bursa");
        //listem.add(1);
        //listem.add(true);
        //listem.add(5.4);
        listem.add("izmir");
        listem.add("hakkari");
        for (String o : listem){
            System.out.println(o);
            System.out.println(o.length());
        }








    }
}
