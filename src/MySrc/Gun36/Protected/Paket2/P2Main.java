package MySrc.Gun36.Protected.Paket2;

import MySrc.Gun36.Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {

        P1Hayvan h2=new P1Hayvan();
        h2.ad="Köpek";

        //h2.cinsi;

        P2Kedi kedi1=new P2Kedi("Mercan","Van Kedisi");
        System.out.println(kedi1);

        P2Kedi kedi2=new P2Kedi();




    }
}
