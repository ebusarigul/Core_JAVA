package MySrc.Gun36.FınalMethod;

public class Araba extends Tasit {
    private String renk;

    public Araba(String model, String renk) {
        super(model);
        this.renk = renk;
    }

    //@Override
    //public String toString() {           üst sınıfta final olan method override edilemezz..
    // return super.toString()+" renk="+renk;
    public void arabaInfo(){
        System.out.println(" model="+getModel()+" renk="+renk);
    }
}

