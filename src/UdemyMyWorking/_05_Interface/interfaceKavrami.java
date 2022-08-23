package UdemyMyWorking._05_Interface;

import java.util.ArrayList;

public class interfaceKavrami {
    public static void main(String[] args) {
/*

        Elma a = new Elma();
        Yenilebilir aa = new Elma();
        Yenilebilir bb = new Inek();

*/
        ArrayList<Yenilebilir> yenilebilenSeyler = new ArrayList<>();


    }

}
class A{

}
class B{

}
/*class C extends B,A{

}*/


interface Yenilebilir {
    void yenmeSekli();

}

class Elma implements Yenilebilir {

    void elmaMetodu() {

    }

    @Override
    public void yenmeSekli() {

    }
}

class Inek implements Yenilebilir {

    void inekMetodu() {

    }

    @Override
    public void yenmeSekli() {

    }
}