package MySrc.Gun36.Protected.Paket1;

import Gun34._02_Ornek.Hayvan;
//aynı paketin içindeki erisim düzeyleri görüldü
public class P1Main {
    public static void main(String[] args) {

        P1Hayvan h=new P1Hayvan();
        h.ad="karakedi";
        h.yas=2;
        h.cinsi="tekir";
        // h.renk private : sadece kendi class ının içinde ulasılabilir.


    }
}
