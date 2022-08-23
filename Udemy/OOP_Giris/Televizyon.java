package Udemy;

public class Televizyon {

    private int kanal;
    private int sesseviyesi;
    private boolean acık;

    public void ac() {
        if (acık == false) {
            System.out.println("televizyon acılıyor");
            acık = true;
        } else {
            System.out.println("televizyon zaten acık");
        }
    }

    public void kapat() {
        if (acık == true) {
            System.out.println("televizyon kapanıyor");
            acık = false;
        } else {
            System.out.println("televizyon zaten kapalı");
        }
    }

    public void setKanal(int yenikanal){
        if (acık && yenikanal > 0 && yenikanal<500){
            kanal=yenikanal;
        }else {
            System.out.println("tv kapalı veya yanlıs bir kanal degeri ");
        }
    }

    public int getKanal() {
        return kanal;
    }

    public int getSesseviyesi() {
        return sesseviyesi;
    }

    public void setSesseviyesi(int sesseviyesi) {
        if (acık && sesseviyesi >0 && sesseviyesi < 20) {
            this.sesseviyesi = sesseviyesi;
        }else {
            sesseviyesi=1;
        }
    }

    public void goster() {
        System.out.println("tv acık mı =" + acık + " kanal no =" + kanal + " ses seviyesi=" + sesseviyesi);
    }


}
