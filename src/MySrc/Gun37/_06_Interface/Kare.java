package MySrc.Gun37._06_Interface;

import java.util.Arrays;

public class Kare extends Dikdortgen {

    public Kare(int en) {
        super(en,en);
    }

    @Override
    public void alani(int... a) {
        System.out.println("kare alanı="+getEn()*getEn());
    }

    @Override
    public void cevresi(int... a) {
        System.out.println("kare cevresi="+4*getEn());
    }
}
