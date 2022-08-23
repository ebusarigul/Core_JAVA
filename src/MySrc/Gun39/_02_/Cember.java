package MySrc.Gun39._02_;

public class Cember extends Sekil{
    private double yaricap;

    public Cember(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    public double cevre() {
        return 2*Math.PI*yaricap;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
