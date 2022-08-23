package MySrc.Gun37._06_Interface;

public class Daire implements Sekil {
    private int yaricap;

    public Daire(int yaricap) {
        setYaricap(yaricap);
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public void cevresi(int... a) {
        System.out.println("daire cevre="+2*Math.PI*yaricap);

    }

    @Override
    public void alani(int... a) {
        System.out.println("daire alanı="+Math.PI*yaricap*yaricap);

    }
}
