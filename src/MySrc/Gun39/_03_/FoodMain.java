package MySrc.Gun39._03_;

public class FoodMain {
    public static void main(String[] args) {


        Baklava bk = new Baklava();
        bk.setName("Baklava");
        System.out.println(bk);
        bk.madeIn();
        bk.taste();

        System.out.println();

        CheeseCake cs = new CheeseCake();
        cs.setName("CheeseCake");
        System.out.println(cs);
        cs.madeIn();
        cs.taste();

        System.out.println();

        GreekSalad gs = new GreekSalad();
        gs.setName("GreekSalad");
        System.out.println(gs);
        gs.madeIn();
        gs.taste();

        System.out.println();

        SezarSalad sz = new SezarSalad();
        sz.setName("SezarSalad");
        System.out.println(sz);
        sz.madeIn();
        sz.taste();


    }
}
