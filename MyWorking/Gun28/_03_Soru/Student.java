package Gun28._03_Soru;

import java.util.ArrayList;

public class Student {
    String ogrname;
    int maxcredit;
    ArrayList<Lesson> dersler;

    public static int kreditoplam(ArrayList<Lesson> ders){
        int kreditoplam=0;
        for (int i = 0; i <ders.size() ; i++) {
            kreditoplam+=ders.get(i).credit;
        }
        if (kreditoplam>10){
            System.out.println("max kredi sayısına ulasıldı. ders ekleyemezsin");
        }else {
            System.out.println("daha fazla kredi alınabilir");
        }
        return kreditoplam;
    }

}
