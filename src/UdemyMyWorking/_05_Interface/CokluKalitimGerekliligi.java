package UdemyMyWorking._05_Interface;

import java.util.ArrayList;

public class CokluKalitimGerekliligi {
    public static void main(String[] args) {

        PopSarkiciOzellikleri popSarkici1 = new Tarkan();
        PopSarkiciOzellikleri popSarkici2 = new Hadise();

        ArrayList<PopSarkiciOzellikleri> sarkicilar = new ArrayList<>();
        sarkicilar.add(popSarkici1);
        sarkicilar.add(popSarkici2);

        popSarkici1.sahnedeDansEt();




    }
}

interface Kisi {
    void yemekYe();
    void sporYap();
}

abstract class Sarkici implements Kisi {
    abstract void sarkiSoyle();
}

interface ArabeskSarkiciOzellikleri {
    void sahnedeSigaraIc();

}

interface PopSarkiciOzellikleri {
    void sahnedeDansEt();
    void duetYap();
    static final int yas = 50;
}

class Tarkan implements PopSarkiciOzellikleri {

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}

class Hadise implements PopSarkiciOzellikleri {

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}


class ArabeskSarkici extends Sarkici {

    @Override
    void sarkiSoyle() {
        System.out.println("Arabesk sarkici sarkı söylüyor");

    }

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }
}

class PopSarkicisi extends Sarkici {

    @Override
    void sarkiSoyle() {
        System.out.println("Pop sarkıcısı sarkı söylüyor");
    }

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }
}

class MuslumBaba implements ArabeskSarkiciOzellikleri, PopSarkiciOzellikleri {

    @Override
    public void sahnedeSigaraIc() {

    }

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}