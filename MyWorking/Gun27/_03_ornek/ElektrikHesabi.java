package Gun27._03_ornek;

public class ElektrikHesabi {
    int toplamTuketim = 0;
    double oran = 0.7;
    double odenecekTutar;


    public int tuketimekle(int tuketim) {
        toplamTuketim = toplamTuketim + tuketim;
        System.out.println("toplamTuketim = " + toplamTuketim);
        return toplamTuketim;
    }

    public double odenecekbul(int toplamTuketim, double oran) {

        double odenecektutar = toplamTuketim * oran;
        System.out.println("odenecektutar = " + odenecektutar);
        return odenecektutar;
    }


}
