package Gun26;

public class OopCalisma3 {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi , ucreti(double)
        // Ogrenci : okulNo, tamAd, okul
        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.

        Okul school = new Okul("TurhanTayan AL", "Bünyamin", 0);
        school.okulbilgileriyazdir();

        Ogrenci3 student = new Ogrenci3(456, "Ebubekir Sarıgül", school.ad);
        student.studentbilgileriyazdir();


    }
}
