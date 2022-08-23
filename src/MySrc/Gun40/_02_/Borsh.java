package MySrc.Gun40._02_;

public class Borsh implements IFood{
    void boil(){

        System.out.println("corbayı 15 dakika kaynatın");
    }

    void eatTomorrow(){

        System.out.println("yarın yenmemesi gerekiyor");
    }
    @Override
    public void taste() {
        System.out.println("sıcak güzel çorba");
    }

    @Override
    public double ucret() {
        return 25;
    }

}
