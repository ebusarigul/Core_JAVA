package MySrc.Gun36._01_Polimorfism;

public class Ciftlik {
    public static void main(String[] args) {

        Hayvan h1 = new Hayvan("Memeli");
        h1.ses();

        Hayvan k1 = new Kopek("İrma");
        k1.ses();
        ((Kopek) k1).kokladi();

        hayvanSes(h1);
        hayvanSes(k1);


    }
    public static void hayvanSes(Hayvan h){
        h.ses();
    }
}
