package UdemyMyWorking._06_TvSimilasyon.Bolum1;

import java.util.ArrayList;

public class Televizyon {
    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal;

    public Televizyon(String marka, String boyut) {
        this.marka = marka;
        this.boyut = boyut;
        kanallar=new ArrayList<>();
        ses=10;
        aktifKanal=1;
        kanallariOlustur();
        this.acik=false;
    }

    public void sesArttir(){
        if (ses < 20 && acik){
            ses++;
            System.out.println("ses seviyesi : "+ses);
        }else {
            System.out.println("ses maksimumda daha fazla arttıramazsın veya tv kapalı");
        }
    }
    public void sesAzalt(){
        if (ses > 0 && acik){
            ses--;
            System.out.println("ses seviyesi : "+ses);
        }else {
            System.out.println("ses minimumda daha fazla azaltamazsın");
        }
    }

    public void tvAc() {
        if (!acik){
            acik=true;
            System.out.println("tv acıldı");
        }else {
            System.out.println("tv zaten açık");
        }
    }

    public void tvKapat() {
        if (acik){
            acik=false;
            System.out.println("tv kapandı");
        }else {
            System.out.println("tv zaten kapalı");
        }
    }
    private void kanallariOlustur() {
        HaberKanali cnn = new HaberKanali("CNN", 1, "Genel Haber");
        kanallar.add(cnn);
        HaberKanali beinSpor = new HaberKanali("Bein Sports", 2, "Spor Haber");
        kanallar.add(beinSpor);
        MuzikKanali dreamTurk=new MuzikKanali("Dream Turk",3,"Yerli");
        kanallar.add(dreamTurk);
        MuzikKanali numberOne=new MuzikKanali("Number One",4,"Yabancı");
        kanallar.add(numberOne);

    }
    public void aktifKanaliGoster(){
        if (acik)
        System.out.println("Aktif Kanal : "+ kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
        else System.out.println("önce televizyonu açın");
    }


    public void kanalDegistir(int acilmasiIstenenKanal){
        if (acik){
            if (acilmasiIstenenKanal != aktifKanal){
                if (acilmasiIstenenKanal <= kanallar.size() && acilmasiIstenenKanal >=0){
                    aktifKanal= acilmasiIstenenKanal;
                    System.out.println("kanal : "+ acilmasiIstenenKanal+" Bilgi : "+kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
                }else {
                    System.out.println("gecerli bir kanal numarası giriniz");
                }

            }else {
                System.out.println("zaten "+ aktifKanal +". kanaldasınız.");
            }

        }else {
            System.out.println("önce televizyonu açınız");
        }
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Marka="+marka+" Boyut="+boyut+" olan tv olusturuldu";
    }
}
