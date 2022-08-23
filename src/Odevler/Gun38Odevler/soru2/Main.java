package Odevler.Gun38Odevler.soru2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //2-  Yanda Ekli tasarıma göre:  (files)
        //
        //Ekteki Tasarıma göre gerekli modülleri yazınız.
        //Sonra her birinden nesne üretiniz.
        //
        //- ürettiğiniz nesneleri bir ArrayListe ekletip, daha sonra bu ArrayList i
        //bir döngü ile metodlarını ekrana yazdırınız.

        TxtFile txt = new TxtFile();
        PowerPointFile pp = new PowerPointFile();
        DMGFile dmg = new DMGFile();
        EXEFile exe = new EXEFile();

        ArrayList<IReadFile> filetype = new ArrayList<>();
        filetype.add(txt);
        filetype.add(pp);
        filetype.add(dmg);
        filetype.add(exe);

        for (IReadFile f : filetype) {
            System.out.println("-----" + f.getClass().getSimpleName() + "-----");
            if (f instanceof TxtFile) {
                System.out.println(f.open());
                System.out.println(f.read());
                System.out.println(f.save());
                System.out.println(f.close());
            }
            if (f instanceof PowerPointFile) {
                System.out.println(f.open());
                System.out.println(f.read());
                System.out.println(f.save());
                System.out.println(f.close());
            }
            if (f instanceof DMGFile) {
                System.out.println(f.open());
                System.out.println(f.read());
                System.out.println(f.save());
                System.out.println(f.close());
            }
            if (f instanceof EXEFile) {
                System.out.println(f.open());
                System.out.println(f.read());
                System.out.println(f.save());
                System.out.println(f.close());
            }
            System.out.println();


        }


    }
}
