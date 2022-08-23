package Gun28._03_calisma;

import java.util.ArrayList;

public class Student {
    String ogrname;
    static int maxcredit;
    ArrayList<Lesson> dersler;

    public static int kreditopla(ArrayList<Lesson> dersler) {
        int toplamkredi = 0;
        for (int i = 0; i < dersler.size(); i++) {
            toplamkredi = toplamkredi + dersler.get(i).credit;
        }
        if (toplamkredi < maxcredit) {
            System.out.println("daha fazla ders secebilirsiniz");
        } else {
            System.out.println("alınabilicek maksimum krediyi geçtiniz.");
        }
        return toplamkredi;
    }

}
