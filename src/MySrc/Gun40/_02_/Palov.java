package MySrc.Gun40._02_;

public class Palov implements IFood{
    void fry(){
        System.out.println("yagda kızartmayınız");
    }
    void boil(){
        System.out.println("15 dakika az suyla beraber pişirin");
    }

    @Override
    public void taste() {
        System.out.println("doyurucu karbonhidrat kaynagı");
    }

    @Override
    public double ucret() {
        return 25;
    }




}
