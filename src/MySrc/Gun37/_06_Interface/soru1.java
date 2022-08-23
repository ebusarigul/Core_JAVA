package MySrc.Gun37._06_Interface;

public class soru1 {
    public static void main(String[] args) {

        //Kare, Dikdortken, ve daire sınıflarından oluşacak bir geometri programı
        //yapılmak isteniyor.bunların ayrı ayrı , fakat ortak metodlarının
        //(cevresi() ve alani() )zorunlu olabilmesi için gerekli yapıyı kurunuz ve yazınız.


        Sekil kare=new Kare(7);
        kare.cevresi();
        kare.alani();

        Sekil dortgen=new Dikdortgen(7,13);
        dortgen.cevresi();
        dortgen.alani();

        Sekil daire=new Daire(6);
        daire.cevresi();
        daire.alani();






    }
}
