package MySrc.Gun39._02_;

public class GeometriMainSinif {
    public static void main(String[] args) {
        //1- içinde name field ı olan Sekil isimli bir Abstract Class yazınız.
        //2- Bu classın Alan ve cevre abstract metodları ve
        // içind eAlan ve cevre nin sonucu olan toString somut metodu,
        //   sekilin adını veren getName somut metodu ve ciz isimli somut metodlarını ekleyiniz.
        //3- Bu sınıftan Dikdörtgen ve Cember isimli 2 class oluşturunuz.
        //4- Bunlardan birer örnek main metodunda çalıştırınız.

        Dikdortgen dk = new Dikdortgen(5, 10);
        dk.setName("Yeni Dikdortgen");
        dk.ciz();
        System.out.println(dk);

        System.out.println();

        Cember cm = new Cember(5);
        cm.setName("Yeni Daire");
        cm.ciz();
        System.out.println(cm);


    }
}
