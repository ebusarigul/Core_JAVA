package Odevler.Gun39Odevler.Soru1;

import java.util.ArrayList;

public class Soru1Main {
    public static void main(String[] args) {
        //1-//4 tane class oluşturulmuştur. Cats, Tigers, Lions, HomeCats
        //Cats class'ı super class'dır. (parent) (Ana)
        //Bütün class'lar Cats class'ının extend'idirler. (Uzantısı, Alt sınıfı, Çocukları)
        //Cats class'ının içine 2 tane method oluşturunuz.
        //1) walk isminde bir method oluşturun. Return tipi void olmalıdır.
        // Bu methodun içinde "Cat is walking" yazdırnız.
        //2) abstract(soyut) method'un ismi talk olmalıdır. Return tipi void olmalıdır.
        //Not: Çünkü bu method soyuttur, bir body'si(beden) yoktur.
        //Bütün child(Çocuk) class'lar Cats class'ının içindeki abstract method' extend olmalıdır.
        //Tiger class'ı abstract method'u
        // "Tiger is talking" yazdırınız.
        //Lion class'ı abstract method'u
        //"Lion is talking" yazdırınız.
        //HomeCat class'ı abstract method'u
        //"Home Cat is talking" yazdırınız.
        //main class'ın içinde
        //Tigers için bir object oluşturun
        //ve bu talking methodunu çağırınız.
        //Sonra walking methodunu çağırınız.
        //Lions için bir object oluşturun
        //ve bu talking methodunu çağırınız.
        //Sonra walking methodunu çağırınız.
        //HoemCats için bir object oluşturun
        //ve bu talking methodunu çağırınız.
        //Sonra walking methodunu çağırınız.
        //Not: Yazdırılacak şeyler 1e1 şekilde yazılmalıdır. Yoksa kod hata verecektir.

        ArrayList<Cats> kediler = new ArrayList<>();

        Tigers tiger = new Tigers();
        Lions lion = new Lions();
        HomeCats homecat = new HomeCats();

        kediler.add(tiger);kediler.add(lion);kediler.add(homecat);

        for (Cats c : kediler) {
            if (c instanceof Tigers) {
                System.out.println("*****" + c.getClass().getSimpleName() + "*****");
                c.talk();
                c.walk();
            }
            if (c instanceof Lions) {
                System.out.println("*****" + c.getClass().getSimpleName() + "*****");
                c.talk();
                c.walk();
            }
            if (c instanceof HomeCats) {
                System.out.println("*****" + c.getClass().getSimpleName() + "*****");
                c.talk();
                c.walk();
            }
            System.out.println();

        }


    }
}
