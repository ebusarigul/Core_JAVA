package Udemy.Calisma;

public class soru1 {
    public static void main(String[] args) {

        //5*5 matris olusturun bu matrisin elemanları 0-9 arasında rastgele degerler atayın
        //bu matrisi ekrana yazdıran ve capraz elemanların toplamını gösteren programı yazın

        int[][] tablo = new int[5][5];

        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo.length; j++) {
                tablo[i][j] = (int) (Math.random() * 9);
                System.out.print(tablo[i][j] + "  ");
            }
            System.out.println();
        }
        int capraztoplam = 0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo.length; j++) {
                if (i == j || i+j == 4) {
                    capraztoplam += tablo[i][j];
                }
            }
        }
        System.out.println("capraztoplam = " + capraztoplam);
    }
}
