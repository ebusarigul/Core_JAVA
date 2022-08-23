package Gun26;

public class Ogrenci3 {
    int okulNo;
    String tamAd;
    String okulu;

    public Ogrenci3(int okulNo,String tamAd,String okul){
        this.okulNo=okulNo;
        this.tamAd=tamAd;
        this.okulu=okul;
    }
    public void studentbilgileriyazdir(){
        System.out.println("okul no="+okulNo+ " adı="+tamAd+ " okulu="+okulu);
    }

}
