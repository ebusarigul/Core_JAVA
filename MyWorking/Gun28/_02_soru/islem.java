package Gun28._02_soru;

public class islem {

    public static int getmax(int a,int b){
        if (a>=b){
            return a;
        }else {
            return b;
        }
    }
    public static int getmin(int a,int b){
        if (a>=b){
            return b;
        }else {
            return a;
        }
    }

    public static int getarraytopla(int [] dizi){
        int toplam=0;
        for (int i = 0; i < dizi.length ; i++) {
            toplam=toplam+dizi[i];
        }
        return toplam;
    }
    public static int getpow(int a,int b){
         int ust= (int) Math.pow(a,b);
        return ust;
    }
    public static int getrandom(int a){
        int random=0;
        random = (int) (Math.random() * a);
        return random;
    }

}
