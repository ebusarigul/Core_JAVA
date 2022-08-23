package Odevler;

public class soru {
    public static void main(String[] args) {


        String[][] tablo = {{"A", "D", "C",}, {"B", "D", "C"}, {"A", "D", "E"},{"E","A","D"}};

        for (int i = 0; i < tablo.length; i++) {
            String[] isimler = {"Ebu", "Mert", "Hakan","Cengiz"};
            String[] dogrular = {"A", "D", "C",};
            int dogrusayisi = 0;
            int yanlissayisi = 0;
            double puan = 0;
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j].equals(dogrular[j])) {
                    dogrusayisi++;
                } else {
                    yanlissayisi++;
                }
                puan=dogrusayisi*33.33;
            }
            System.out.println(isimler[i] + " öğrencisinin" + "\n"+"dogru sayisi = "+ dogrusayisi +"\n"+"yanlıs sayısı = "+ yanlissayisi+"\n"+"puanı = " + puan+"\n"+"---------");
        }


    }


}

