package Odevler.Gun38Odevler.soru1;

import java.util.ArrayList;

public class HayvanatBahcesiMain {
    public static void main(String[] args) {
        //1-  Yanda Ekli tasarıma göre: (animal)
        //
        //Ekteki Tasarıma göre gerekli modülleri yazınız.
        //Sonra her birinden nesne üretiniz.
        //
        //- ürettiğiniz nesneleri bir ArrayListe ekletip, daha sonra bu ArrayList i
        //bir döngü ile metodlarını ekrana yazdırınız.

        Cat cat = new Cat();
        Shark shark = new Shark();
        Swallow sw = new Swallow();
        Duck dc = new Duck();

        ArrayList<IAnimal> hayvanlar = new ArrayList<>();
        hayvanlar.add(cat);
        hayvanlar.add(shark);
        hayvanlar.add(sw);
        hayvanlar.add(dc);

        for (IAnimal a : hayvanlar) {
            System.out.println("-----"+a.getClass().getSimpleName()+"-----");
            if (a instanceof Cat) {
                System.out.println(a.food());
            } else if (a instanceof Shark) {
                System.out.println(a.food());
                System.out.println(((Shark) a).sailing());
            } else if (a instanceof Swallow) {
                System.out.println(a.food());
                System.out.println(((Swallow) a).flying());
            } else if (a instanceof Duck) {
                System.out.println(a.food());
                System.out.println(((Duck) a).flying());
                System.out.println(((Duck) a).sailing());
            }
            System.out.println();

        }


    }
}