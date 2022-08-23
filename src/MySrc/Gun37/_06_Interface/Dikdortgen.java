package MySrc.Gun37._06_Interface;

public class Dikdortgen implements Sekil {
    private int en;
    private int boy;

    public Dikdortgen(int en, int boy) {
        setEn(en);
        setBoy(boy);
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }


    @Override
    public void cevresi(int... a) {
        System.out.println("ddortgen cevre="+(en+boy)*2);

    }

    @Override
    public void alani(int... a) {
        System.out.println("ddortgen alan="+en*boy);

    }
}
