package Gun30.soru;

public class Hesap {
    int yatan;
    int cekilen;
    int toplam = 0;
    private int kalanbakiye;

    public int getYatan() {
        System.out.println("yatırılan miktar = " + yatan);
        System.out.println("toplam = " + toplam);
        return yatan;
    }

    public void setYatan(int yatan) {
        this.yatan = yatan;
        toplam += yatan;
        kalanbakiye += yatan;
    }

    public int getCekilen() {
        System.out.println("cekilen miktar = " + cekilen);
        System.out.println("toplam = " + toplam);
        return cekilen;
    }

    public void setCekilen(int cekilen) {
        this.cekilen = cekilen;
         if (cekilen<=toplam) {
            kalanbakiye -= cekilen;
            toplam -= cekilen;
        }else {
             System.out.println("hesabınızda yeterli para yok");
         }

    }

    public int getKalanbakiye() {
        System.out.println(Musteri.name+" "+Musteri.surname + " isimli müsterinin kalan para miktarı = " + toplam);
        return toplam;

    }


}
