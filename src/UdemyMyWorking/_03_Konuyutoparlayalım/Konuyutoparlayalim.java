package UdemyMyWorking._03_Konuyutoparlayalım;

public class Konuyutoparlayalim {
    public static void main(String[] args) {

        Canli canli = new Canli();
        canli.adiniSoyle();

        Canli kartal = new Kartal();
        kartal.adiniSoyle();
        ((Kartal) kartal).uc();

        Canli panda = new Panda();
        panda.adiniSoyle();
        ((Panda) panda).oyna();

        Panda p2= (Panda) panda;
        p2.oyna();


    }

    public static Canli rastgeleSec() {

        int sec = (int) (Math.random() * 3);
        Canli canli;
        if (sec == 0) {
            canli = new Canli();
        } else if (sec == 1) {
            canli = new Kartal();

        } else {
            canli = new Panda();
        }
        return canli;
    }

}

class Canli {

    public void adiniSoyle() {
        System.out.println("ben bir canli sınıfı nesnesiyim");
    }
}

class Kartal extends Canli {

    @Override
    public void adiniSoyle() {
        System.out.println("ben bir kartal sınıfı nesnesiyim");
    }

    public void uc() {
        System.out.println("ben ucabilirim");
    }
}

class Panda extends Canli {

    @Override
    public void adiniSoyle() {
        System.out.println("ben bir panda sınıfı nesnesiyim");
    }

    public void oyna() {
        System.out.println("ben oyun oynamayı cok severim");
    }
}