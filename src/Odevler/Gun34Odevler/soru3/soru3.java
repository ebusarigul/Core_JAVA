package Odevler.Gun34Odevler.soru3;

import java.util.ArrayList;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        //3-//Burada iki class vardır. Biri Main diğeri ise Subscribe.
        //**Subscribe class'ının içinde;**
        //Bu variables'ları **private** oluşturunuz.
        //String name
        //boolean doYouWanaSubscribe
        //String whichMember
        //3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)
        //**Main class'ın içinde;**
        //Örnek;
        //Name is Victoria, doYouWanaSubscribe true, whichMember Gold
        //Eğer user(kullanıcı) **Gold** member(üye) olmak istiyorsa;
        //**Welcome to membership Victoria. Your membership is 40 dollar
        // for month you can enjoy the videos , all homework and see you soon. yazdırınız.**
        //Eğer user(kullanıcı) **Silver** member(üye) olmak istiyorsa;
        //**Welcome to membership Victoria. Your membership is 20 dollar
        // for month you can enjoy the videos and all homework. yazdırınız.**
        //Eğer user(kullanıcı) **Bronze** member(üye) olmak istiyorsa;
        //**Welcome to membership Victoria. Your membership is 10 dollar
        // for month you can enjoy the videos. yazdırınız.**
        //Eğer user(kullanıcı) member(üye) olmak istemiyorsa;
        //**See you when you want to be a member. Thanks yazdırınız.**

        Scanner oku = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);
        ArrayList<Subscribe> subs = new ArrayList<>();

        int secim = 0;
        do {
            Subscribe subscribe = new Subscribe();
            System.out.print("üye olmak için 1" + "\n" + "cıkmak için 2 ye basınız =");
            secim = okuint.nextInt();
            if (secim == 1) {
                subscribe.setDoYouWanaSubscribe(true);
                System.out.print("isim giriniz = ");
                subscribe.setName(oku.nextLine());
                System.out.print("üyelik türünü giriniz = ");
                subscribe.setWhichMember(memberShip.valueOf(oku.nextLine()));

                subs.add(subscribe);

            } else {
                subscribe.setDoYouWanaSubscribe(false);
            }

        } while (secim != 2);
        for (Subscribe s : subs){
            System.out.println(s);
        }

    }
}
