package MySrc.Gun42._03_StringIslemleri;

public class _01_StringKarsilastirma {
    public static void main(String[] args) {

        String cumle1 = "bugun hava çok guzel";
        String cumle2 = "bugun hava çok guzel";
        String cumle3 = new String("bugun hava çok guzel");
        String cumle4 = new String("bugun hava çok guzel");

        if (cumle1 == cumle2) {  // == ilkel tipler için değerleri aynı mı, nesneler için aynı nesne mi ?
            System.out.println("cumle1 cumle2 ye eşit");
        } else {
            System.out.println("cumle1 cumle2 ye eşit değil");
        }

        if (cumle1.equals(cumle2)) {  // equals ilkel tipler ve nesneler için DEGERLERİ aynı mı ?
            System.out.println("cumle1 cumle2 ye eşit");
        } else {
            System.out.println("cumle1 cumle2 ye eşit değil");
        }
        //***************Nesneler için Sonuçlar*************************

        if (cumle3 == cumle4) {
            System.out.println("cumle3 cumle4 ye eşit");
        } else {
            System.out.println("cumle3 cumle4 ye eşit değil");
        }

        if (cumle3.equals(cumle4)) {
            System.out.println("cumle3 cumle4 ye eşit");
        } else {
            System.out.println("cumle3 cumle4 ye eşit değil");
        }

    }


}

