package Udemy._04_Ornek;

public class ElektrikHesabi {
    private int toplamTuketim=0;
    int odenecektutar;
    int toplamtuketim;

    public int getToplamTuketim() {
        System.out.println("toplamTuketim = " + toplamTuketim);
        return toplamTuketim;
    }

    public void setToplamTuketim(int tuketim) {
        toplamTuketim=toplamTuketim+tuketim;
    }

    public int getOran() {
        int oran = 2;
        return oran;
    }

    public int getOdenecektutar() {
        odenecektutar = toplamTuketim * getOran();
        System.out.println("odenecektutar = " + odenecektutar);
        return odenecektutar;
    }

    public void bilgileriYazdir(){
        System.out.println("isimli abonenin odeyecegi tutar =" + getOdenecektutar()+"tl");
    }
}
