package MySrc.Gun43;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class _07_JavaCheckedUncheckedException {
    public static void main(String[] args) {

    // java derki : yazılımcıya bıraktıgı katalara UnChecked Exception denir
    // Ama öyle komutlar var ki bana ait : bunları hata kontrolu yapmadan
    // yani try catch e almadan kullanmana izin VERMEM. bu gibi hata durumlarına
    // CHECKED yani kontrol ettigim hatalar denir..

        try {
            FileInputStream file=new FileInputStream("liste.txt");
        } catch (FileNotFoundException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        // bu komut dosya okuma islemini baslatır.dosyayı açar











    }
}
