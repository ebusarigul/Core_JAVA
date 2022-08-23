package Gun31._Final_;

public class soru2 {
    public static void main(String[] args) {
        // Vatandas isimli bir Class tanımlayınız (fields: isim, tcNo)
        // tcNo değerini int olarak alınız ve nesne oluşturulurken
        // sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
        // kontrol için mainde 2 kişi tanımlayınız.

        Vatandas v1=new Vatandas("ebubekir");
        Vatandas v2=new Vatandas("alp");
        Vatandas v3= new Vatandas("mehmet");

        //final değişkenlerine sadece 1 kez veri atanabilir.
        // o da ya tanımlanırken, yada constructor da atanabilir

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

    }
}
class Vatandas{
    String isim;
    final int tcNo;  // değiştirilemez, yani sadece 1 kez veri atama sansı var
    static int sayac=1001; // bir tanesin

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = ++sayac;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}