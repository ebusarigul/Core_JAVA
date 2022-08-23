package Gun26;

public class Okul {
    String ad;
    String mudurAd;
    double ucret;

    public Okul(String ad,String mudurAd,double ucret){
        this.ad=ad;
        this.mudurAd=mudurAd;
        this.ucret=ucret;
    }

    public void okulbilgileriyazdir(){
        System.out.println("okul adı ="+ad+ " mudur adı="+mudurAd+ " ucreti ="+ucret );
    }
}
