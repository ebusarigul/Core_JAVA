package Gun28._Calisma_;

import java.util.ArrayList;

public class Student {
    private String name;
    private int maxcredit;
    private ArrayList<Lesson> dersListe;

    public Student(String name, int maxcredit, ArrayList<Lesson> dersListe) {
        this.name = name;
        this.maxcredit = maxcredit;
        this.dersListe = dersListe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxcredit() {
        return maxcredit;
    }

    public void setMaxcredit(int maxcredit) {
        this.maxcredit = maxcredit;
    }

    public ArrayList<Lesson> getDersListe() {
        return dersListe;
    }

    public void setDersListe(ArrayList<Lesson> dersListe) {
        this.dersListe = dersListe;

    }

    public void kreditopla(ArrayList<Lesson> liste) {
        int kreditoplam = 0;
        for (int i = 0; i < liste.size(); i++) {
            if (kreditoplam<=maxcredit) {
                kreditoplam = kreditoplam + liste.get(i).getCredit();
                System.out.println("ders eklendi= " + dersListe.get(i).getDersname() + " toplam kredi= "+kreditoplam);
            }else {
                System.out.println(dersListe.get(i).getDersname()+ " ders kredi aşıldıgı için eklenemedi");
            }
        }
        System.out.println("kreditoplam = " + kreditoplam);
        if (kreditoplam > getMaxcredit()) {
            System.out.println("krediniz doldu ders secmeyin");
        } else {
            System.out.println("daha fazla kredi alabilirsiniz");
        }

    }
}
