package MySrc.Gun39._02_;

public class Dikdortgen extends Sekil {

    private double uzunkenar;
    private double kisakenar;

    public Dikdortgen(int uzunkenar, int kisakenar) {
        this.uzunkenar = uzunkenar;
        this.kisakenar = kisakenar;
    }
    @Override
    public double alan() {
        return uzunkenar * kisakenar;
    }
    @Override
    public double cevre() {
        return (uzunkenar + kisakenar) * 2;
    }

}
