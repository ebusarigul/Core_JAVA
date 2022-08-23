package MySrc.Gun37._05_Interface;

public class Test implements IGosterir, IYazdirir {

    @Override
    public void goster() {
        System.out.println("Goster");

    }

    @Override
    public void yaz(String mesaj) {
        System.out.println(mesaj);

    }

    @Override
    public void yaz() {
        System.out.println("yaz aq");

    }
}
